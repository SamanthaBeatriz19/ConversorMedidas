package conversor;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;



public class FindClasses {
	
	private static Class[] getClasses(String pkgName)
			throws ClassNotFoundException, IOException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		assert classloader != null;
		String path = pkgName.replace('.', '/');
		Enumeration resources = classloader.getResources(path);
		List dirs = new ArrayList();
		
		while(resources.hasMoreElements()) {
			URL resource = (URL) resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		
		ArrayList classes = new ArrayList();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory,pkgName));
		}
		
		return (Class[]) classes.toArray(new Class[classes.size()]);
		
	}

	private static Collection findClasses(File directory, String pkgName) throws ClassNotFoundException {
		List classes = new ArrayList();
		
		if(!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for(File file : files) {
			if(file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file,pkgName+"."+file.getName()));
			}else if(file.getName().endsWith(".class")){
				classes.add(Class.forName(pkgName+'.'+file.getName().substring(0,file.getName().length())));
			}
		}
		
		return classes;
	}

}

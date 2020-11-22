package conversor;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;




public class FindClasses {
	
		public static ArrayList<String> result = new ArrayList<String>();
		
		

		public static void scan(ClassLoader classLoader, Set<String> locations,
				Set<String> packages) {
			if (!(classLoader instanceof URLClassLoader)) {
				return;
			}

			URLClassLoader urlLoader = (URLClassLoader) classLoader;
			URL[] urls = urlLoader.getURLs();

			for (URL url : urls) {
				String path = url.getFile();
				File location = null;
				try {
					location = new File(url.toURI());
				} catch (URISyntaxException e) {
					e.printStackTrace();
					return;
				}

				if (matchesAny(path, locations)) {
					if (location.isDirectory()) {
						getClassesInDirectory(null, location, packages);
					} 
				}
			}
		}

		public static ArrayList<String> getClassesInDirectory(String parent, File location,
				Set<String> packagePatterns) {
			File[] files = location.listFiles();
			StringBuilder builder = null;
			
			//ArrayList<String> result = new ArrayList<String>();

			for (File file : files) {
				builder = new StringBuilder(100);
				builder.append(parent).append("/").append(file.getName());
				String packageOrClass = (parent == null ? file.getName() : builder
						.toString());

				if (file.isDirectory()) {
					getClassesInDirectory(packageOrClass, file, packagePatterns);
				} else if (file.getName().endsWith(".class")) {
					if (matchesAny(packageOrClass, packagePatterns)) {
						if(packageOrClass.contains("metrics")) {
							//System.out.println(packageOrClass);
							result.add(packageOrClass);
							
						}
					}
				}
			}
			return result;
		}



		public static boolean matchesAny(String text, Set<String> filters) {
			if (filters == null || filters.size() == 0) {
				return true;
			}
			for (String filter : filters) {
				if (text.indexOf(filter) != -1) {
					return true;
				}
			}
			return false;
		}

	public static ArrayList<String> getClassesAdress() {
		scan(Thread.currentThread().getContextClassLoader(),
					Collections.emptySet(), Collections.emptySet());
			
			return result;
	}
	
	public static ArrayList<String> ClassNames(){
		scan(Thread.currentThread().getContextClassLoader(),
				Collections.emptySet(), Collections.emptySet());
	
		
		for(int a=0;a<result.size();a++) {
			String aux = (String) result.get(a);
			aux.replace("metrics/", " ");
			aux.replace(".class"," ");
			result.set(a, aux);
		}
		
		return result;
	}
	
}

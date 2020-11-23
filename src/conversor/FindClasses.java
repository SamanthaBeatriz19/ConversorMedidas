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


/**Class that find Classes
* @author Samantha Beatriz
* @version 1.00
* @since 23/11/2020
*/

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
						getClassesByDirectory(null, location, packages);
					} 
				}
			}
		}

		public static ArrayList<String> getClassesByDirectory(String parent, File location,
				Set<String> packagePatterns) {
			File[] files = location.listFiles();
			StringBuilder builder = null;

			for (File file : files) {
				builder = new StringBuilder(100);
				builder.append(parent).append("/").append(file.getName());
				String Address = (parent == null ? file.getName() : builder
						.toString());

				if (file.isDirectory()) {
					getClassesByDirectory(Address, file, packagePatterns);
				} else if (file.getName().endsWith(".class")) {
					if (matchesAny(Address, packagePatterns)) {
						if(Address.contains("metrics")) {
							result.add(Address);
							
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

	
	public static ArrayList<String> ClassNames(){
		result.clear();
		
		scan(Thread.currentThread().getContextClassLoader(),
				Collections.emptySet(), Collections.emptySet());
		
		return result;
	}	
}
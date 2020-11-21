package conversor;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {
	
	
	 private static String getTextFromResourceFile(String fileName)
     {
     StringBuilder finalText = new StringBuilder();
     try (BufferedReader reader = new BufferedReader(new InputStreamReader(FileReader.class.getResourceAsStream(fileName))))
        {
        String buffer;

        while ((buffer = reader.readLine()) != null)
           {
           finalText.append(buffer + "\n");
           }
        }
     catch (NullPointerException e)
        {
    	 System.out.println( "\nError in loading file " + fileName + "\n" + e.getMessage());
        }
     catch (IOException e)
        {
    	 System.out.println( "\nError in loading file " + fileName + "\n" + e.getMessage());
        }

     return (finalText.toString());
     }
	 
	 
	 public static String getHelpText()
     {
		 return (getTextFromResourceFile("/resources/Help.txt"));
     }
	 
	 public static String getUseTermText()
     {
		 return (getTextFromResourceFile("/resources/UseTerm.txt"));
     }
  
}

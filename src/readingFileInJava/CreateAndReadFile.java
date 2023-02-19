package readingFileInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CreateAndReadFile {
	static Object browser1;
	static Object browser2;
	static Object driver1;
	static Object driver2;
	
	public static void main(String[] args) {
	 doesFileExist("data\\test.properties");
	 System.out.println("Browser:");
	 System.out.println(browser1);
	 System.out.println(browser2);
	 System.out.println("");
	 System.out.println("Drivers:");
	 System.out.println(driver1);
	 System.out.println(driver2);
	 
	
	
		
			
		}
	 public  static String doesFileExist(String path) {
			Properties prop = new Properties();
			FileInputStream f = null;
			try {
				f = new FileInputStream(path);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				prop.load(f);
			} catch (IOException e) {
				System.out.println("File does not exist");
			}
			 browser1 = prop.get("Browser1");
			 browser2 = prop.get("Browser2");
	
			driver1 = prop.get("Driver1");
			driver2 =  prop.get("Driver2");
			
			
			return path;
		
	  }		
	

}

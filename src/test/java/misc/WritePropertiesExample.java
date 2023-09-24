package misc;

import java.io.FileOutputStream;
import java.util.Properties;

public class WritePropertiesExample {

	private static FileOutputStream fos=null;
	private static String filePath=null;
	private static String fileName="propertywrite.properties"; 
	private static Properties property = new Properties();
	public static void main(String[] args) throws Exception {
		filePath = new java.io.File( "src/properties" ).getCanonicalPath();
		fos = new FileOutputStream(filePath+"/"+fileName);
		property.setProperty("userName", "HelloUserWrite");
		property.setProperty("password", "Hello@123");
		property.store(fos, "writing properties to a file");
		fos.close();
		
	}

}

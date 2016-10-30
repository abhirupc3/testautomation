package misc;




import java.io.InputStream;
import java.util.Properties;
/*
 * THIS CLASS WILL SHOW AN EXAMPLE TO READ DATA FROM PROPERTY FILE
 */
public class ReadPropertyExample {

	private static InputStream is;
	private static Properties property =new Properties();
	public static void main(String[] args) throws Exception {

	is = ReadPropertyExample.class.getResourceAsStream("/properties/propread.properties");
	
	property.load(is);
	System.out.println("User name from the property is "+ property.getProperty("username"));
	System.out.println("Password name from the property is "+ property.getProperty("password"));
	}
}

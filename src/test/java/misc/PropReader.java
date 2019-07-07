package misc;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropReader {
public static void main(String[] args) throws IOException {
	Properties ps = new Properties();
	InputStream is = PropReader.class.getResourceAsStream("properties/config.properties");
	ps.load(is);
	System.out.println(ps.get("name"));
	
}
}

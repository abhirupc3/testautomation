package ToDelete;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTest {
public static void main(String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-YYYY hh:mm:ss:SSS");
	Date date = new Date();
	String formatedPattern = sdf.format(date);
	System.out.println(formatedPattern);
}
}

package misc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
  public static void main(String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("MMM:dd:YYYY-HH:mm:ss:sss");
	String s = sdf.format(new Date());
	System.out.println(s);
}
}

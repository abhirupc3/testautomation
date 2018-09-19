package misc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
  public static void main(String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("MM:dd:YYYY-HH:mm");
	String s = sdf.format(new Date());
	System.out.println(s);
}
}

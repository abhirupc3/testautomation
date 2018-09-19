package misc;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatExample {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat sm = new SimpleDateFormat("DD-MM-YYYY");
		Date dte = new Date();
		String formatedDate = sm.format(dte);
		System.out.println("Unformatted date is :"+dte);
		System.out.println("Formatted Date is :"+formatedDate);
		
		//String to Date
		
		String date = "30-11-1980 20:30:45";
		SimpleDateFormat sm2 = new SimpleDateFormat("DD-MM-YYYY hh:mm:ss");
		Date dte2 = sm2.parse(date);
		System.out.println(dte2);
		
	}

}

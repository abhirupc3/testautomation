package misc;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class SimpleDateFormatExample {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat sm = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss:SSS");
		Date dte = new Date();
		String formatedDate = sm.format(dte);
		System.out.println("Unformatted date is :"+dte);
		System.out.println("Formatted Date is :"+formatedDate);
		//String to Date
		
		String date = "30-11-1980 20:30:45:123";
		SimpleDateFormat sm2 = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss:SSS");
		Date dte2 = sm2.parse(date);
		System.out.println(dte2);
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now().plusDays(1));
		System.out.println(LocalTime.now().plusHours(12));
		
		
	}

}

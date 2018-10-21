package misc;

import java.util.Calendar;
import java.util.Random;

public class Callender {

	
	public static void main(String[] args) {
		Calendar callender = Calendar.getInstance();
		System.out.println("Day Of The Month Is : "+ callender.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day Of The week Is : "+ callender.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day Of The Year Is : "+ callender.get(Calendar.DAY_OF_YEAR));
		System.out.println("Time in millis Is : "+ callender.getTimeInMillis());
		Random Rn = new Random(Integer.MAX_VALUE);
		System.out.println(Rn.nextInt());
		int i[] ={1,2};
		i = new int[i.length+1];
		i[0]=5;
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
	}
}

package newPreperation.jan1st2020.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Wrte a program to find if the number is a good number: 
 * A number is good if its every digit is larger than the sum of digits which are on the right side of that digit. 
 * For ex. 9620 is good number because 2 > 0, 6 > 2+0 and 9 > 6+2+0.
 * @author 19094
 *
 */
public class GoodNumber {

	public static void main(String[] args) {
		int num = 9690;
		checkGoodNumber(num);
	}

	private static void checkGoodNumber(int num) {
		int sum = num%10;
		num=num/10;
		boolean isGood=true;
		while(num!=0)
		{
			int digit =num%10;
			if(sum>=digit)
			{
				System.out.println("Not a good Number");
				isGood=false;
				break;
			} else {
				sum=sum+digit;
			}
			num=num/10;
		}
		if(isGood)
		{
			System.out.println("A good Number");
		}
	}
}

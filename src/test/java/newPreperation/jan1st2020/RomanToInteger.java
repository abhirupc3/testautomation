package newPreperation.jan1st2020;
/**
 * Write a program to convert Roman number to Integer:
 * for ex. input: XV output 15
 * @author 19094
 *
 */
public class RomanToInteger {
    public static void main(String[] args) {
		String num="xix";
		char[] c = num.toCharArray();
		int sum=0;
		int previous=0;
		for (int i=c.length-1;i>=0;i--) {
			int n= getInteger(c[i]);
			if(previous<n)
			{
				sum=sum+n;             
				previous=n;
			}else {
				sum=sum-n;
				previous=n;
			}
		}
		System.out.println(sum);
	}

	private static int getInteger(char num) {
		switch(num)
		{
		case 'i':
			return 1;
		case 'v':
			return 5;
		case 'x':
			return 10;
		case 'l':
			return 1;
		case 'c':
			return 5;
		case 'd':
			return 10;
		case 'm':
			return 10;
		default:
			return 0;
		}
	}
}

package misc;

public class NumberReverse {

	private static int num=144;
	private static int rev=0;
	public static void main(String[] args) {

		System.out.println("the originm number is :"+num);
		System.out.println("the number after reverse is :"+reverse(num));
	}

	
	public static int reverse(int num)
	{
		while(num!=0){
			rev=rev*10+num%10;
			num = num/10;
		}
		return rev;
	}
}

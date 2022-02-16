package newPreperation.jan1st2020.basics;
/**
 * Write a Program to reverse a Number:
 * input: 123
 * output: 321
 * @author 19094
 *
 */
public class NumReverse {
 public static void main(String[] args) {
	int i=123;
	numRev(i);
}

private static void numRev(int i) {
	int rev=0;
	while(i!=0)
	{
		rev = rev*10+i%10;
		i=i/10;
	}
	System.out.println("The reversed number is: ");
	System.out.println(rev);
}
}

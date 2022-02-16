package newPreperation.jan1st2020.basics;
/**
 * Write a program to sum all it's digits;
 * for ex. input: 123; output:6
 * @author 19094
 *
 */
public class DigiSum {
  public static void main(String[] args) {
	int x=123;
	int tmp=x;
	int sum=0;
	while(x != 0)
	{
		sum=sum+x%10;
		x=x/10;
	}
	System.out.println("sum of all digits for input : "+tmp);
	System.out.println(sum);
}
}

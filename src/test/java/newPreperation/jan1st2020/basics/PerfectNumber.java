package newPreperation.jan1st2020.basics;
/**
 * A number is a perfect number if is equal to sum of its proper divisors,
 *  that is, sum of its positive divisors excluding the number itself. 
 *  input: 28 output: true
 * @author 19094
 *
 */
public class PerfectNumber {
 public static void main(String[] args) {
	int x=29;
	isPerfect(x);
}

private static void isPerfect(int x) {
	int sum=0;
	for (int m=1;m<x;m++)
	{
		if(x%m==0)
			sum=sum+m;
	}
	if(x==sum)
	{
		System.out.println("Perfect number");
	} else {
		System.out.println("Not a perfect number");
	}
}
}

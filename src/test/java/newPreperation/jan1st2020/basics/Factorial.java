package newPreperation.jan1st2020.basics;
/**
 * Write a program to find the factorial of a number
 * Input : 5
 * output: 120
 * @author 19094
 *
 */
public class Factorial {
 public static void main(String[] args) {
	 int i=5;
	 int fact=0;
	 int factRec=0;
	fact = fact(i);
	System.out.println(fact);
	factRec = factRec(i);
	System.out.println(factRec);
}

private static int factRec(int i) {
	if(i==0)
		return 1;
	return i*factRec(i-1);
}

private static int fact(int i) {
	if(i==0)
		return 1;
	int fact =1;
	for(int m=1;m<=i;m++)
	{
		fact=fact*m;
	}
	return fact;
}
}

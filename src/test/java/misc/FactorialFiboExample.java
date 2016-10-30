package misc;

public class FactorialFiboExample {

	private static int fact =1;
	public static void main(String[] args) {
		
		System.out.println("Factorial of 6 is : "+factFibo(6));
	}
	
	public static int factFibo(int n)
	{
		if(n==0)
			return 1;
		return n*factFibo(n-1);
	}
}

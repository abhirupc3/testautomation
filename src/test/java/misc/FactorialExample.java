package misc;

public class FactorialExample {

	private static int fact=1;
	public static void main(String[] args) {

		System.out.println("factorial of 6 is : "+fact(6));
	}
	
	public static  int fact(int n){
		for (int i=1;i<=n;i++){
		fact=fact*i	;
		}
		return fact;
	}

}

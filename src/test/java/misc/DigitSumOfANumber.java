package misc;

public class DigitSumOfANumber {

	private static int sum;
	public static void main(String[] args) {

		System.out.println("The Digit is :  1234");
		System.out.println("Sum Of digits "+digiSum(1234));
	}

	private static int  digiSum(int i) {
		while(i!=0){
		sum = sum+i%10;
		i=i/10;
		}
		return sum;
	}

}

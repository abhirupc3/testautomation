package misc;

public class DigitSumOfANumber {

	private static int sum;
	private static int sum1;
	public static void main(String[] args) {
		findGoodNumber(410,520,3);
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
	public static void findGoodNumber(int x,int y, int index)
	  {
		
		  for(int p=x;p<=y;p++)
		  {
			  boolean match=true;
			  int temp=p;
			  sum1=0;
			  int counter = 0;
			  while(temp!=0)
			  {
				  int digit = temp%10;
				  if(counter!=0 && (digit<=sum1 || digit==index))
				  {
					  match=false;
					  break;
				  }
				sum1 = sum1+digit;
				temp=temp/10;
				counter++;
			  }
			  if(match)
			  {
				  System.out.println("The numer is:"+p);
			  }
		  }
	  }
}

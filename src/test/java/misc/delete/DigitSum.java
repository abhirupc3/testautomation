package misc.delete;

public class DigitSum {
	int sum=0;
  public static void main(String[] args) {
	int i = 12345;
	new DigitSum().sum(i);
}
  public void sum(Integer i)
  {
	  while(i!=0)
	  {
		  sum = sum+i%10;
		  i=i/10;
	  }
	  System.out.println(sum);
  }
}

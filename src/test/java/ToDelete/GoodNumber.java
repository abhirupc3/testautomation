package ToDelete;

public class GoodNumber {
  public static void main(String[] args) {
	printGoodNumbers(410, 520, 3);
}
  public static void printGoodNumbers(int startIndex,int endIndex,int key)
  {
	  for(int k=startIndex;k<endIndex;k++)
	  {
		  int number=k;
		  int sum=0;
		  sum=sum+k%10;
		  number=number/10;
		  boolean good=true;
		  while(number!=0)
		  {
			 int temp=number%10;
			 if(temp<=sum || number==3)
			 {
				 good=false;
				 break;
			 }
			 sum=sum+temp;
			 number=number/10;
		  }
		  if(good)
		  {
			  System.out.println(k);
		  }
	  }
  }
}

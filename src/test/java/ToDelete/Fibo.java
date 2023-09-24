package ToDelete;

public class Fibo {
//1,1,2,3,5,8,13
	public static void main(String[] args) {
		int x=8;
		int currentVal=1;
		int prevVal=1;
		//System.out.println(prevVal);
		//System.out.println(currentVal);
		for(int y=0;y<x;y++) {
			System.out.println(fiboRecr(y));
			/*int t=currentVal;
			currentVal=currentVal+prevVal;
			System.out.println(currentVal);
			prevVal=t;*/
			
		}
		
	}
	public static int fiboRecr(int y)
	{
	  if(y==0||y==1)
		  return y;
	  return fiboRecr(y-1)+fiboRecr(y-2);
	}
}

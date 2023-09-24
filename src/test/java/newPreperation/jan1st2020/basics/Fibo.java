package newPreperation.jan1st2020.basics;

/**
 * Write a program to print fibonacci series. for ex. 1,2,3,5,8
 * 
 * @author 19094
 *
 */
public class Fibo {
	public static void main(String[] args) {
		int input = 8;
		//printFibo(input);
		for(int i=0;i<8;i++)
		{
			System.out.println(printFiboRec(i));
		}
	}

	private static void printFibo(int input) {
		int prev=0;
		//int cur=1;
		int next=1;
		System.out.println(prev);
		while(next<=8)
		{
			System.out.println(next);
			int tmp=next;
			next=prev+next;
			prev=tmp;
			
		}
	}
	public static int printFiboRec(int i)
	{
		if(i==0 || i==1)
			return i;
		return printFiboRec(i-1)+printFiboRec(i-2);
		
	}
}

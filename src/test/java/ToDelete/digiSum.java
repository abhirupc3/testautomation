package ToDelete;

public class digiSum {
	static int x=12345;
           public static void main(String[] args) {
			addNum(x);
		}
	 
	public static void addNum(int yy)
	{
		int sum = 0;
				while(yy!=0)
				{
					sum = sum+yy%10;
					yy=yy/10;
				}
				
				System.out.println("Value of sum is:");
				System.out.println(sum);
	}
	
}

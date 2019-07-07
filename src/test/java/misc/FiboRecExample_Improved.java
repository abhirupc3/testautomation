package misc;

public class FiboRecExample_Improved {

	public static void main(String[] args) {
			fiboEx(9);

	}

	
	public static void fiboEx(int i)
	{
		int first=0,second=1;
		System.out.println(first);
		System.out.println(second);
		int current;
		for(int p=1;p<i-1;p++)
		{
			current=first+second;
			System.out.println(current);
			first=second;
			second=current;
		}
	}
}

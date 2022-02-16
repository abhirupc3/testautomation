package misc;

public class FiboRecExample {

	public static void main(String[] args) {
		for(int k=0;k<8;k++)
		{
			System.out.println(fiboEx(k));
		}

	}

	
	public static int fiboEx(int i)
	{
		if(i==0 || i==1)
			return i;
		return fiboEx(i-1)+fiboEx(i-2);
	}
}

package misc;

public class Str_Rev {

	public static void main(String[] args) {

		String s = "Hello java World";
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}

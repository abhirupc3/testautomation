package newPreperation.jan1st2020.basics;

/**
 * write a program to reverse a string input: abc output:cba
 * 
 * @author 19094
 *
 */
public class StrRev {
	public static void main(String[] args) {
		String input = "Hello";
		reverse(input);
		String s = reverseRec(input);
		System.out.println(s);
	}

	private static String reverseRec(String input) {
		if(input.length()==1)
			return input;
		return input.charAt(input.length()-1)+reverseRec(input.substring(0, input.length()-1));
		
	}

	private static void reverse(String input) {
		String s="";
		for(int i=input.length()-1;i>=0;i--)
		{
			s = s+ String.valueOf(input.charAt(i));
		}
		System.out.println(s);
		
	}
}

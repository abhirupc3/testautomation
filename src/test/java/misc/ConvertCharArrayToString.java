package misc;

public class ConvertCharArrayToString {

	
	public static void main(String[] args) {
		char c[] ={'s','f','e','r','y'};
		String s = String.copyValueOf(c);
		System.out.println(s);
		
	}
}

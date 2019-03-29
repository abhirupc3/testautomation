package misc;

import org.omg.Messaging.SyncScopeHelper;

public class ConvertCharArrayToString {

	
	public static void main(String[] args) {
		char c[] ={'s','f','e','r','y'};
		String s = String.copyValueOf(c);
		String s1 = new String(c);
		System.out.println(s);
		System.out.println(s1);
		
	}
}

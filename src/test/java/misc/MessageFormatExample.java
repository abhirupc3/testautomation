package misc;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {

		String s = "Hello {0} java {1}";
		String [] arg = {"dear","world"};
		s = MessageFormat.format(s, arg);
		System.out.println(s);
		
		String f = "Hello java %s";
		String g[] = {"User"};
		f = f.format(f,g );
		System.out.println(f);
	}

}

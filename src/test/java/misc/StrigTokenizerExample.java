package misc;

import java.util.StringTokenizer;

public class StrigTokenizerExample {

	private static String s = "Hello Java World";
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
	}

}

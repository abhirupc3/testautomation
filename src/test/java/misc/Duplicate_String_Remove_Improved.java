package misc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate_String_Remove_Improved {

	private static String s = "Hello java World";
	private static Set<String> set = new HashSet<String>();
	public static  String result  = new String();
	public static void main(String[] args) {
		for(int k=0;k<s.length();k++)
		{
			if(result.indexOf(s.charAt(k))<0)
			{
				result=result+s.charAt(k);
			}
		}
		System.out.println(result);
	}
}

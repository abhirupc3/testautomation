package misc;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate_String_Remove {

	private static String s = "Hello java World";
	private static Set<String> set = new LinkedHashSet<String>();
	public static void main(String[] args) {

	char c[]= s.toCharArray();
	for(char cc : c)
	{
		set.add(Character.toString(cc));
	}
	
	Iterator it = set.iterator();
	
	System.out.println("original Data :--> "+s);
	System.out.println("Data After duplicate remove :-->");
	while(it.hasNext()){
		System.out.print(it.next());
	}
	}

}

package misc;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	private static ArrayList<String> list = new ArrayList<String>();
 public static void main(String[] args) {
	
	 list.add("Abhi1");
	 list.add("Abhi12");
	 list.add("Abhi13");
	 list.add("Abhi14");
	 list.add("Abhi15");
	 list.add("Abhi16");
	 list.add("Abhi17");
	 System.out.println("The data from the list is : ");
	 Iterator it = list.iterator();
	 while (it.hasNext())
	 {
		 System.out.println(it.next());
	 }
}
}

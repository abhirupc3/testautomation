package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class KeySort {
	static Hashtable<Integer, List> ht = new Hashtable<Integer, List>();
	static List<Integer> l1 = new ArrayList<Integer>();
	static List<Integer> l2 = new ArrayList<Integer>();
	static List<Integer> l3 = new ArrayList<Integer>();

	public static void main(String[] args) {
		l1.add(-1);
		l1.add(2);
		l2.add(2);
		l2.add(3);
		l3.add(3);
		l3.add(4);
		ht.put(4, l3);
		ht.put(2, l1);
		ht.put(3, l2);
		List<Integer> sortedList = new ArrayList(ht.keySet());
		System.out.println(sortedList);
		Collections.sort(sortedList,Collections.reverseOrder());
		System.out.println(sortedList);
		for(int i:sortedList)
		{
			List l = ht.get(i);
			System.out.println(l.get(0)+","+l.get(1));
		}
	}

}

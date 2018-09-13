package newPreperation.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample implements Comparator<String>{

	static List<String> fruit = new ArrayList<String>();
	public static void main(String[] args) {
		ignoreCaseSort();
		caseSensetiveSort();
	}
	/**
	 * For doing case insensitive sort we need to implement comparator interface and use compareToIgnoreCase method
	 * and we need to use Collections.sort(list,comparator)
	 */
	public static void ignoreCaseSort()
	{
		fruit.clear();
		fruit.add("Mange");
		fruit.add("apple");
		fruit.add("Orrange");
		fruit.add("Banana");
		System.out.println("+++++++++Before ignoreCase sort+++++++++");
		for (String fr : fruit) {
			System.out.println(fr);
		}
		System.out.println("++++++++++After ignoreCase Sort++++++++++");
		Collections.sort(fruit,new SortExample());
	
	for (String fr : fruit) {
		System.out.println(fr);
	}
	}
	
	public static void caseSensetiveSort()
	{
		fruit.clear();
		fruit.add("Mange");
		fruit.add("Apple");
		fruit.add("Orrange");
		fruit.add("Banana");
		System.out.println("+++++++++Before caseSensetive sort+++++++++");
		for (String fr : fruit) {
			System.out.println(fr);
		}
		System.out.println("++++++++++After caseSensetive Sort++++++++++");
		Collections.sort(fruit);
	
	for (String fr : fruit) {
		System.out.println(fr);
	}
	}

	public int compare(String o1, String o2) {
		
		return o1.compareToIgnoreCase(o2);
	}
}

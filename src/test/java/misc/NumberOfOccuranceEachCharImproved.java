  package misc;

import java.util.HashMap;
import java.util.Map;

import collection.MapImpl.Entry;

public class NumberOfOccuranceEachCharImproved {

	private static Map<String,String> map = new HashMap<String,String>();
	private static String s= "Hello california!";
	static HashMap<String,Integer> hm = new HashMap<String,Integer>();
	public static void main(String[] args) {
		String s1="";
		for (int i=0;i<s.length();i++)
		{
			add(s.charAt(i));
		}
		
		for(java.util.Map.Entry<String, Integer> e:hm.entrySet())
		{
			System.out.println(e.getKey()+" number of occurance "+e.getValue());
		}
	}
	public static void add(char c)
	{
		if(hm.containsKey(String.valueOf(c)))
		{
			hm.put(String.valueOf(c), hm.get(String.valueOf(c))+1);
		} else {
			hm.put(String.valueOf(c), 1);
		}
	}
}

package misc;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccuranceEachChar {

	private static Map<String,String> map = new HashMap<String,String>();
	private static String s= "Hello california";
	public static void main(String[] args) {

		char [] c = s.toCharArray();
		for(char cc : c)
		{
			int counter=0;
			for(char cc2:c)
			{
				if(cc==cc2)
				{
					counter++;
				}
			}
			map.put(String.valueOf(cc), String.valueOf(counter));
		}
		
		for(Map.Entry<String,String> e:map.entrySet())
		{
			System.out.println("The char is : "+e.getKey());
			System.out.println("The number of occurance is : "+e.getValue());
		}
	}

}

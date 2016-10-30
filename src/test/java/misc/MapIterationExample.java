package misc;

import java.util.HashMap;
import java.util.Map;

public class MapIterationExample {

	private static Map<String,String> map =new HashMap<String,String>();
	public static void main(String[] args) {
   
		 Map<String,String> m = populateMap(map);
		 for(Map.Entry<String,String> e: m.entrySet())
		 {
			 System.out.println("Key :"+e.getKey());
			 System.out.print("value "+e.getValue()+"\n");
		 }
		
	}

	
	public static Map<String,String> populateMap(Map map1)
	{
		map1.put("username", "Abhirup");
		map1.put("password", "abhirup@123");
		map1.put("title", "chatterjee");
		return map1;
	}
}

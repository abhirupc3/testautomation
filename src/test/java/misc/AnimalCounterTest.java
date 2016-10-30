package misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class AnimalCounterTest {

	public static void main(String[] args) throws Exception {
		BufferedReader  br = new BufferedReader(new FileReader(new File(ClassLoader.getSystemResource("misc/animals.txt").getPath())));
		String line = "";
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		while((line=br.readLine())!=null){
			updateMap(line.split(","),hm);
		}
		
		
		for(Map.Entry<String,Integer> e:hm.entrySet()){
			System.out.println(e.getKey()+" Number of Occurs  "+e.getValue());
		}
		
	}
	public static  void updateMap(String[] animals,HashMap<String, Integer> hm)
	{
		for(String s:animals){
			if(hm.get(s)!=null){
				hm.put(s, hm.get(s)+1);
			} else
			{
				hm.put(s, 1);
			}
		}
	}

}

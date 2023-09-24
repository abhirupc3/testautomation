package newPreperation.jan1st2020.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * +Write a program to find nth most popular number
 * 
 * @author 19094
 *
 */
class OccrCounter implements Comparable<OccrCounter>
{

	Integer occurance=0;
	Integer num =0;
	public OccrCounter(int occurance,int num)
	{
		this.occurance=occurance;
		this.num=num;
	}
	public Integer getOccurance() {
		return occurance;
	}
	public Integer getNum() {
		return num;
	}
	public int compareTo(OccrCounter o) {
		
		return this.occurance.compareTo(o.occurance);
	}
	
}

public class MostPopularNumber {
	public static void main(String[] args) {
		int [] i = {1,2,3,3,3,5,6,8,12,12,9,9,0,9,0,3,3,4,4,4,4,4};
		findNthPopularNum(i, 4);
	}
	private static void findNthPopularNum(int[] i, int j) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		List<Integer> occList = new ArrayList<Integer>();
		for (int u = 0; u < i.length; u++) {
			if (hm.containsKey(i[u])) {
				hm.put(i[u], hm.get(i[u]) + 1);
			} else {
				hm.put(i[u], 1);
			}
		}
		List<OccrCounter> aL = new ArrayList<OccrCounter>();
		for(Map.Entry<Integer,Integer> e: hm.entrySet())
		{
			aL.add(new OccrCounter(e.getValue(),e.getKey()));
		}
		Collections.sort(aL,Collections.reverseOrder());
		System.out.println("The "+j+"th most popular elementis: "+aL.get(j).getNum()+"\n The number of occurance is: "+aL.get(j).getOccurance());
	}
}

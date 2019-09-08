package misc;

import java.util.HashMap;
import java.util.Map;

public class TopTwoMostPopular_improved{
 public static void main(String[] args) {
	int num[] = {1,47,3,6,5,4,3,4,3,3,2,11,2};
	findTwoMostPop(num);
}

private static void findTwoMostPop(int[] num) {
	HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	int occurance1=0;
	int occurance2=0;
	int pop1=0,pop2=0;
	for(int n:num)
	{
		if(hmap.containsKey(n))
		{
			hmap.put(n,hmap.get(n)+1);
			
		}else {
			hmap.put(n,1);
		}
	}
	for(Map.Entry<Integer,Integer> e:hmap.entrySet())
	{
		if(e.getValue()>occurance1)
		{
			occurance1=e.getValue();
			pop1=e.getKey();
		}
		if(e.getValue()<occurance1 && e.getValue()>occurance2)
		{
			occurance2=e.getValue();
			pop2=e.getKey();
			
		}
	}
	System.out.println("Most popular :"+pop1+" Number of occurance :"+occurance1);
	System.out.println("second most popular :"+pop2+" Number of occurance :"+occurance2);
}
}

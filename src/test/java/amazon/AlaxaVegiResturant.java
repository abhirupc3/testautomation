package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AlaxaVegiResturant {
	//
	public static void findRest() {
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		ArrayList<Integer> StatusList = new ArrayList<Integer>();
		StatusList.add(1);
		list1.add(StatusList);
		System.out.println(list1);
	}

	static List<List<Integer>> nearestVegetarianRestaurant(int totalRestaurants, List<List<Integer>> allLocations,
			int numRestaurants) {
		int xCord=0;
		int yCord=0;
		int index=0;
		Map<Double, List<Integer>> distanceMap = new HashMap<Double, List<Integer>>();
		double[] distance=new double[totalRestaurants];
		for (List<Integer> list : allLocations) {
			xCord=list.get(0);
			yCord=list.get(1);
			distance[index]=CalculateDistance(xCord,yCord);
			distanceMap.put(distance[index], list);
			index++;
		}
		Map<Double, List<Integer>> sortMap = new TreeMap<Double, List<Integer>>(distanceMap);
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		
		Collection entrySet = sortMap.entrySet();
		for (Map.Entry<Double, List<Integer>> entry : sortMap.entrySet()) 
		{
			if(numRestaurants!=0)
            list1.add(entry.getValue());
            numRestaurants--;
		}
		System.out.println(list1);
		return list1;
	}
    public  static double CalculateDistance(int x, int y)
    {
    	return Math.sqrt((x*x)+(y*y));
    }
	public static void main(String[] args) {
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		ArrayList<Integer> StatusList = new ArrayList<Integer>();
		StatusList.add(1);
		StatusList.add(-3);
		list1.add(StatusList);
		ArrayList<Integer> S1 = new ArrayList<Integer>();
		S1.add(1);
		S1.add(2);
		list1.add(S1);
		ArrayList<Integer> S2 = new ArrayList<Integer>();
		S2.add(3);
		S2.add(4);
		list1.add(S2);
		nearestVegetarianRestaurant(3,list1,2);
	}
}

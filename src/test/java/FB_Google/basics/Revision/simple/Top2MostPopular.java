package FB_Google.basics.Revision.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class Top2MostPopular {
    public static void main(String[] args) {
        Top2MostPopular top = new Top2MostPopular();
        int[] a = {1, 3, 2, 78, 78,78,43, 5, 0,43, 9};
        top.printMostPopular2(a);
    }

    private void printMostPopular2(int[] a) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int c = 0; c < a.length; c++) {
            if (mp.containsKey(a[c])) {
                mp.put(a[c], mp.get(a[c]) + 1);
            } else {
                mp.put(a[c], 1);
            }
        }
        int oc1=Integer.MIN_VALUE;
        int oc2=Integer.MIN_VALUE;
        int value1=0;
        int value2=0;
        for(Map.Entry<Integer,Integer> e: mp.entrySet())
        {
            if(e.getValue()>oc1)
            {
                value2=value1;
                value1=e.getKey();
                oc2=oc1;
                oc1=e.getValue();
            } else if(e.getValue()<oc1 && e.getValue()>oc2)
            {
                value2=e.getKey();
                oc2=e.getValue();
            }
        }
        if(value1!=Integer.MIN_VALUE)
        {
            System.out.println("The most populatNumber is: "+value1+ "The number of occurrance is: "+oc1);
        }
        if(value2!=Integer.MIN_VALUE)
        {
            System.out.println("The second most populatNumber is: "+value2+ "The number of occurrance is: "+oc2);
        }
    }
}

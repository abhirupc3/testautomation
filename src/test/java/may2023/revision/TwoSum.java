package may2023.revision;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 6/10/23
 * @project testautomation
 */
public class TwoSum {
    public static void main(String[] args) {
        int a[] = {1,2,5,4,9,3};
        TwoSum ts = new TwoSum();
        HashMap<Integer,Integer> hm = ts.getNum(a);
        for(Map.Entry<Integer,Integer> en:hm.entrySet())
        {
            System.out.println(en.getKey()+"--"+en.getValue());
        }
    }

    private HashMap<Integer, Integer> getNum(int[] a) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int diff=Integer.MAX_VALUE;
        for(int k=0;k<a.length;k++)
        {
            diff = 9-a[k];
            if(hm.containsKey(diff))
            {
                hm.clear();
                hm.put(diff,a[k]);
                return hm;
            } else{
                hm.put(a[k],0);
            }
        }
        return hm;
    }
}

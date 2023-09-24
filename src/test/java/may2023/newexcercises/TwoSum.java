package may2023.newexcercises;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 5/1/23
 * @project testautomation
 * Write a program to identify 2 numbers in the array whose sum is equal to 9
 * input: {2,3,4,5,6,4,9}
 * output: 4,5
 */
public class TwoSum {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,6,4,9};
        TwoSum ts = new TwoSum();
        HashMap<Integer,Integer> map = ts.getTwo(a);
        System.out.println("The values are");
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey()+","+e.getValue());
        }
    }

    private HashMap getTwo(int[] a) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<a.length;i++)
        {
            int diff = 9-a[i];
            if(map.containsValue(diff))
            {
                map.clear();
                map.put(diff,a[i]);
                return map;
            }
            else{
                map.put(i,a[i]);
            }
        }
        return map;
    }
}

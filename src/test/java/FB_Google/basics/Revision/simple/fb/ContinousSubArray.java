package FB_Google.basics.Revision.simple.fb;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 3/12/22
 * <p>
 * *@project testautomation
 * *This program shoud perform 2operation.
 * *for a given array i={5,4,3,2,1,4}and a key=7;
 * *it has to find howmany sub array sum is equal to key or divisible by key
 * *Another operation should be if the array has any sub array which is divisible by key or equal to key
 * *https://www.youtube.com/watch?v=QM0klnvTQzk
 **/
public class ContinousSubArray {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5,9};
        int key=9;
        ContinousSubArray conti = new ContinousSubArray();
        conti.printSubArray(i, key);
    }

    private void printSubArray(int[] i, int key) {
        Map<Integer, Integer> mp = new HashMap<>();
        Map<Integer, Integer> result = new HashMap<>();
        int sum = 0;
        for (int y = 0; y < i.length; y++) {
            sum=sum+i[y];
            int mod = sum % key;
            if (!mp.containsKey(mod))
                mp.put(mod, y);
            else if (mp.containsKey(mod)) {
                result.put(mp.get(mod), y);
                mp.put(mod, y);
            }
        }
        System.out.println("COmpleted");

        for(Map.Entry<Integer,Integer> e : result.entrySet())
        {
            for(int k=e.getKey()+1;k<=e.getValue();k++)
            {
                System.out.print(i[k]+ " ");

            }
            System.out.println("\n");
        }
    }
}

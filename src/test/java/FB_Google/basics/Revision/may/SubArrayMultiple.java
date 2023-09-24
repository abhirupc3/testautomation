package FB_Google.basics.Revision.may;

import java.util.*;

/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class SubArrayMultiple {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5};
        int key = 9;
        findsubArrayMultiple(i, key);
    }

    public static void findsubArrayMultiple(int[] i, int key) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        int sum = 0;
        int mod = 0;
        for (int k = 0; k < i.length; k++) {
            sum = sum + i[k];
            mod = sum % key;
            if (mp.containsKey(mod)) {
                indexMap.put(mp.get(mod) + 1, k);
            } else {
                mp.put(sum, k);
            }
        }
        for(Map.Entry<Integer,Integer> entry: indexMap.entrySet())
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}

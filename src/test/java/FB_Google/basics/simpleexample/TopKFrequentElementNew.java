package FB_Google.basics.simpleexample;


import java.util.*;

/**
 * @author achatterjee ON 2/14/22
 * @project testautomation
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElementNew {

    public static void main(String[] args) {
        int[] i = {4,1,-1,2,-1,2,3};
        TopKFrequentElementNew t = new TopKFrequentElementNew();
        int ke=3;
        t.calculate(i,ke);
    }
    public int findTopkElement(Map<Integer,Integer> mp, int k)
    {
        int max = Integer.MIN_VALUE;
        int key=0;
        for(Map.Entry<Integer,Integer> e: mp.entrySet())
        {
            if(e.getValue()>max)
            {
                max = e.getValue();
                key=e.getKey();
            }
        }

        System.out.println("The element is: "+ key+" repeatation count is:  "+max);
        mp.remove(key);
        if(k==1)
            return max;

        return findTopkElement(mp,k-1);


    }




    private void calculate(int[] i,int ke) {

        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int k=0;k<i.length;k++)
        {
            if(mp.containsKey(i[k]))
            {
                mp.put(i[k],mp.get(i[k])+1);
            } else{
                mp.put(i[k],1);

            }

        }

        findTopkElement(mp,ke);
    }
}

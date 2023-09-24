package FB_Google.basics.Revision.may;

import java.util.*;

/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class MostrepeatedKElement {
    public static void main(String[] args) {
        int[] i = {4,1,-1,2,-1,2,3};
         getTopKElements(i,2);
    }

    private static void getTopKElements(int[] i,int depth) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int k: i)
        {
            if(mp.containsKey(k))
            {
                mp.put(k,mp.get(k)+1);
            }else{
                mp.put(k,1);
            }
        }
        List<Frequency> li = new ArrayList<Frequency>();
        for(Map.Entry<Integer,Integer> e: mp.entrySet())
        {
            li.add(new Frequency(e.getKey(),e.getValue()));
        }
        Collections.sort(li,Collections.reverseOrder());
        int counter = 1;
        for(Frequency fre: li)
        {
            System.out.println(fre.key+"      "+fre.freq);
            if(counter==depth)
                break;
            counter++;
        }
    }

    static class Frequency implements Comparable<Frequency>
    {
        int key;
        int freq;
        Frequency(int key, int freq)
       {
           this.key=key;
           this.freq=freq;
       }
        @Override
        public int compareTo(Frequency o) {
            return this.freq-o.freq;
        }
    }
}

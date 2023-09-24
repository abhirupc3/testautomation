package FB_Google.basics.simpleexample.practice.new1;

import FB_Google.basics.simpleexample.TopKFrequentElement;

import java.util.*;

/**
 * @author achatterjee ON 2/24/22
 * @project testautomation
 */
public class TopKFreq {
    public static void main(String[] args) {
        int[] i = {4,1,-1,2,-1,2,3};
        TopKFreq t = new TopKFreq();
        int y[] = t.topKFrequent(i,2);
        for(int p:y)
        {
            System.out.print(p+" ");
        }
    }

    private int[] topKFrequent(int[] i, int i1) {

       Map<Integer,Integer> mp = new HashMap<>();
       for(int k=0;k<i.length;k++)
       {
           if(mp.containsKey(i[k]))
           {
              mp.put(i[k],mp.get(i[k])+1);
           } else{
               mp.put(i[k],1);
           }
       }
       List<Element1> li = new ArrayList<>();
       for(Map.Entry<Integer,Integer> e: mp.entrySet())
       {
           li.add(new Element1(e.getKey(),e.getValue()));
       }
       Collections.sort(li);
       int [] o = new int [i1];
       for(int m=0;m<i1;m++)
       {
          o[m]= li.get(m).element;
       }
       return o;
    }
}
class Element1 implements Comparable<Element1>{
    int element=0;
    int freq=0;
    Element1(int element, int freq)
    {
        this.element=element;
        this.freq=freq;
    }
    public int compareTo(Element1 e)
    {
        return e.freq-this.freq;
    }

}
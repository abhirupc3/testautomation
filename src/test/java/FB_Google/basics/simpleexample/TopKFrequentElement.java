package FB_Google.basics.simpleexample;


import java.util.*;

/**
 * @author achatterjee ON 2/14/22
 * @project testautomation
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElement {

    public static void main(String[] args) {
        int[] i = {4,1,-1,2,-1,2,3};
        TopKFrequentElement t = new TopKFrequentElement();
        int y[] = t.topKFrequent(i,2);
        for(int p:y)
        {
            System.out.print(p+" ");
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> mp = new TreeMap<>();

      for(int p=0;p<nums.length;p++)
      {
          if(mp.containsKey(nums[p]))
          {
              mp.put(nums[p],mp.get(nums[p])+1);
          } else{
              mp.put(nums[p],1);
          }
      }
      List<Frequency> l = new ArrayList<>();
      for(Map.Entry<Integer,Integer> e: mp.entrySet())
      {
          int f=e.getValue();
          int v = e.getKey();
          l.add(new Frequency(f,v));
      }
      Collections.sort(l,Collections.reverseOrder());
      int result[] = new int[k];
      for(int m=0;m<k;m++)
      {
          result[m] = l.get(m).val;
      }
      return result;
    }
}
class Frequency implements Comparable<Frequency>{
    int fre;
    int val;
    Frequency(int fre,int val)
    {
        this.fre=fre;
        this.val = val;
    }
    public int compareTo(Frequency freq)
    {
        return this.fre-freq.fre;
    }
}

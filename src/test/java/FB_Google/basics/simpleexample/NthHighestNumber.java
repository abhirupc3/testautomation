package FB_Google.basics.simpleexample;
import java.util.*;
/**
 * @author achatterjee ON 5/22/22
 * @project testautomation
 */
public class NthHighestNumber {


    public static void main(String[] args) {
        int[] i = {1,2,32,1,32,44,12,3};
        NthHighestNumber nth=new NthHighestNumber();
        List<Integer> li = new ArrayList<Integer>();
        for(int l=0;l<i.length;l++)
        {
            li.add(i[l]);
        }
        int max=Integer.MIN_VALUE;
        max = nth.findMax(li);
        int count = 1;
        while(count<=3)
        {
          li.remove(new Integer(max));
          max = nth.findMax(li);
          count++;
        }
        System.out.println("The nth highest number is: "+max);
    }



    public int findMax(List<Integer> i)
    {
        int max = Integer.MIN_VALUE;
        for(int k: i)
        {
          if(k>max)
              max=k;
        }
        return max;
    }
}

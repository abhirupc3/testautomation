package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class SubArraySum {
    public static void main(String[] args) {
        int[] num = {5,4,6,1,1,2};
        printSubArraySum(num,9);
    }

    public static void printSubArraySum(int[] num, int target)
    {
         Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
         Map<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
         int sum = 0;
         mp.put(0,-1);
        for(int k=0; k< num.length;k++)
        {
            sum = sum+num[k];
            int diff = sum-target;
            if(mp.containsKey(diff))
            {
                indexMap.put(mp.get(diff)+1,k);
            } else{
                mp.put(sum,k);
            }
        }

        for(Map.Entry<Integer,Integer> e: indexMap.entrySet())
        {
            System.out.println(e.getKey()+"    "+e.getValue());
        }
    }
}

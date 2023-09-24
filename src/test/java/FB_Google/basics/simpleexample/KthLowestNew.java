package FB_Google.basics.simpleexample;
import java.util.*;
/**
 * @author achatterjee ON 5/30/22
 * @project testautomation
 */
public class KthLowestNew {

    public static void main(String[] args) {
        int[] i = {1,2,32,1,32,44,12,3};
        List<Integer> s = new ArrayList<Integer>();
        for(int k: i)
        {
            if(!s.contains(k))
               s.add(k);
        }
        List<Integer> s1 = new ArrayList<Integer>();
        for(int k: i)
        {
            if(!s1.contains(k))
            s1.add(k);
        }
        KthLowestNew kth = new KthLowestNew();
        int k=3;
        int ij = kth.findLowest(s,k);
        System.out.println("\nThe value of "+k+"th Lowest num is: \n"+ij);
        int ij1 = kth.findHighest(s1,k);
        System.out.println("\nThe value of "+k+"th Highest num is: \n"+ij1);
    }

    private int findLowest(List<Integer> s, int key) {

        int min = Integer.MAX_VALUE;

        for(int n:s)
        {
            if(min>n) {
                min = n;
            }

        }
        s.remove(Integer.valueOf(min));
        System.out.println(min);
        if(key==1)
            return min;


        return findLowest(s,key-1);
    }



    private int findHighest(List<Integer> s, int key) {

        int max = Integer.MIN_VALUE;

        for(int n :s)
        {
            if(max<n) {
                max = n;
            }

        }
        s.remove(Integer.valueOf(max));
        System.out.println(max);
        if(key==1)
            return max;


        return findHighest(s,key-1);
    }
}

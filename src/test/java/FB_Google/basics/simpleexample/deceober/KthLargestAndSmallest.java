package FB_Google.basics.simpleexample.deceober;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author achatterjee ON 12/2/22
 * @project testautomation
 */
public class KthLargestAndSmallest {
    public static void main(String[] args) {
        KthLargestAndSmallest kTh= new KthLargestAndSmallest();
        int[] i = {1,2,32,1,32,44,12,3};
        List<Integer> l = new ArrayList<Integer>();
        for(int k=0;k<i.length;k++)
        {
            if(!l.contains(i[k]))
            l.add(i[k]);
        }

       // kTh.findLargest(l,3);
        kTh.findSmallext(l,3);
    }

    private int findLargest(List<Integer> i, int key) {
        int max = Integer.MIN_VALUE;
        System.out.println("The value of  largest numbers are");
        for(int j=0;j<i.size();j++)
        {
            if(max<i.get(j)) {
                max = i.get(j);

            }
        }
        i.remove(Integer.valueOf(max));
        System.out.println(max);
        if(key==1)
            return max;
        return findLargest(i,key-1);
    }
    private int findSmallext(List<Integer> i, int key) {
        int min = Integer.MAX_VALUE;
        System.out.println("The value of  smallest numbers are");
        for(int j=0;j<i.size();j++)
        {
            if(min>i.get(j)) {
                min = i.get(j);

            }
        }
        i.remove(Integer.valueOf(min));
        System.out.println(min);
        if(key==1)
            return min;
        return findSmallext(i,key-1);
    }
}

package FB_Google.basics.simpleexample.practice.new1;

import FB_Google.basics.simpleexample.KthLargestelement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author achatterjee ON 2/19/22
 * @project testautomation
 */
public class KthLargest {
    public static void main(String[] args) {
        KthLargest kt =new KthLargest();
        int n[] = {3,2,1,5,6,4};
        int result =     kt.findKthLargest(n,2);
        System.out.println(result);
    }

    private int findKthLargest(int[] n, int i) {
        List<Element> li = new ArrayList<>();
        for(int m=0;m<n.length;m++)
        {
            li.add(new Element(n[m]));
        }
        Collections.sort(li,Collections.reverseOrder());
        int counter =1;
        for(Element e: li)
        {
           if(counter==i)
           {
               return e.i;
           } counter++;
        }
        return -1;
    }
}
class Element implements Comparable<Element>{
    int i;
    Element(int i)
    {
        this.i=i;
    }
    public int compareTo(Element e)
    {
        return this.i-e.i;
    }
}
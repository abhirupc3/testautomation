package FB_Google.basics.simpleexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author achatterjee ON 2/11/22
 * @project testautomation
 */
public class KthLargestelement {
    public static void main(String[] args) {
        KthLargestelement kt =new KthLargestelement();
        int n[] = {3,2,1,5,6,4};
            int result =     kt.findKthLargest(n,2);
        System.out.println(result);
    }
    public int findKthLargest(int[] nums, int k) {
        List<Element> numList = new ArrayList<Element>();

        for(int num:nums)
        {
            numList.add(new Element(num));
        }
        Collections.sort(numList,Collections.reverseOrder());
        Element element = numList.get(k-1);
        return element.num;

    }

    class Element implements Comparable<Element>
    {
        int num=0;
        Element(int num)
        {
            this.num=num;
        }
        public int compareTo(Element e)
        {
            return this.num-e.num;
        }
    }
}

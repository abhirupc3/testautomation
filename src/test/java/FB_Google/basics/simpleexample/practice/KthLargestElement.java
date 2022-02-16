package FB_Google.basics.simpleexample.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author achatterjee ON 2/13/22
 * @project testautomation
 */
public class KthLargestElement {
    public static void main(String[] args) {
        KthLargestElement k = new KthLargestElement();
        int n[] = {3,2,1,5,6,4};
        int key=2;
        int value = k.kThLargest(n,key);
        System.out.println("The element is :"+value);
    }

    public int kThLargest(int[] values,int key)
    {
        List<Element> eleList = new ArrayList<Element>();
        for(int m=0;m<values.length;m++)
        {
            eleList.add(new Element(values[m]));
        }
        Collections.sort(eleList,Collections.reverseOrder());
        return eleList.get(key-1).num;
    }
    class Element implements Comparable<Element>{
        int num;
        Element(int num)
        {
            this.num = num;
        }
        public int compareTo(Element ele)
        {
            return this.num-ele.num;
        }
    }
}

package FB_Google.basics.Revision.April;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author achatterjee ON 4/23/22
 * @project testautomation
 */
public class NthLargest {
    public static void main(String[] args) {
        int[] i = {1,2,4,2,4,87,21,234,5,6};

        new NthLargest().findLargest(i);
        new NthLargest().Find2ndLarge(i,87);
    }

    private void Find2ndLarge(int[] i, int l) {
        int largest=Integer.MIN_VALUE;
        int largest2=Integer.MIN_VALUE+1;

        for(int k=0;k<i.length;k++)
        {
            if(i[k]<=l) {
                if (i[k] > largest) {
                    largest2 = largest;
                    largest = i[k];
                } else if (i[k] < largest && i[k] > largest2) {
                    largest2 = i[k];
                }
            }
        }
        System.out.println("Value is: "+largest2);
    }


    private  void findLargest(int[] i) {
        List<Largest> li = new ArrayList<Largest>();
        for(int k=0;k<i.length;k++)
        {
          li.add(new Largest(i[k]));
        }

        for(Largest l:li)
        {
            System.out.println(l.item);
        }
        System.out.println("After Sorting:\n");
        Collections.sort(li,Collections.reverseOrder());
        for(Largest l:li)
        {
            System.out.println(l.item);
        }
    }

    class Largest implements Comparable<Largest>
    {
        int item;
        public Largest(int item)
        {
         this.item=item;
        }
        @Override
        public int compareTo(Largest o) {
            return this.item-o.item;
        }
    }
}

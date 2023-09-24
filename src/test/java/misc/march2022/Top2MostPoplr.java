package misc.march2022;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 3/9/22
 * @project testautomation
 */
public class Top2MostPoplr {
    public static void main(String[] args) {
        int i[] = {1,1,1,1,1,1,1,1,1,2,2,3,3,3,5,5,5,5,5,5,4};
        printPopular(i);
    }

    private static void printPopular(int[] i) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int k=0;k<i.length;k++)
        {
            int t = i[k];
            if(mp.containsKey(t))
            {
                mp.put(t,mp.get(t)+1);
            } else {
                mp.put(i[k], 1);
            }
        }
        int pop1=Integer.MIN_VALUE;
        int pop2=Integer.MIN_VALUE;
        int pop3=Integer.MIN_VALUE;
        int oc1=0;
        int oc2=0;
        int oc3=0;
        for(Map.Entry<Integer,Integer> en: mp.entrySet())
        {
            if(en.getValue()>oc1)
            {
                oc3=oc2;
                oc2=oc1;
                oc1=en.getValue();
                pop3=pop2;
                pop2=pop1;
                pop1=en.getKey();
            } else if(en.getValue()<oc1 && en.getValue()>oc2)
            {
                oc3=oc2;
                oc2=en.getValue();
                pop3=pop2;
                pop2=en.getKey();
            }else if(en.getValue()<oc2 && en.getValue()>oc3)
            {
                oc3=en.getValue();
                pop3=en.getKey();
            }
        }
        System.out.println("First popular number is: "+pop1+" Number of occurrance is: "+oc1);
        System.out.println("Second popular number is: "+pop2+" Number of occurrance is: "+oc2);
        System.out.println("Third popular number is: "+pop3+" Number of occurrance is: "+oc3);
    }
}

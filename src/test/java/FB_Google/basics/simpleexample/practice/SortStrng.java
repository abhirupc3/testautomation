package FB_Google.basics.simpleexample.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author achatterjee ON 3/5/22
 * @project testautomation
 */
public class SortStrng {
    public static void main(String[] args) {
        String s = "Abhirup Chatterjee";
        String order = "rup";
        sortString(s,order);
    }

    private static void sortString(String s, String order) {
        List<String> aList = new ArrayList<>();
        for(int k=0;k<s.length();k++)
        {
            aList.add(String.valueOf(s.charAt(k)));
        }
        StringBuilder sb = new StringBuilder();
        for(int m=0; m<order.length();m++)
        {
            System.out.println(order.charAt(m));
            if(aList.contains(String.valueOf(order.charAt(m))))
            {
                sb.append(order.charAt(m));
                aList.remove(String.valueOf(order.charAt(m)));
            }
        }
        for(String st : aList)
        {
            sb.append(st);
        }

        System.out.println("Before ordering"+s);
        System.out.println("ordered String is :"+sb.toString());
    }
}

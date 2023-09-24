package FB_Google.basics.Revision.April;

import java.util.ArrayList;
import java.util.List;

/**
 * @author achatterjee ON 4/19/22
 * @project testautomation
 */
public class CustomSortString {
    public static void main(String[] args) {
        String s1 = "AAbcde";
        s1=s1.replace("A","");
        System.out.println(s1);
        String order = "cbafg", s = "abcd";
        customSortString(order,s);
    }

    private static void customSortString(String order, String s) {
        List<Character> li = new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
          li.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
         for(int k=0;k<order.length();k++)
         {
             if(li.contains(order.charAt(k)))
             {
                 Character c = order.charAt(k);
                 li.remove(c);
             }
             sb.append(order.charAt(k));
         }

        for(Character c:li)
        {
            sb.append(c);
        }

        System.out.println("The value of the String is: "+sb.toString());
    }
}

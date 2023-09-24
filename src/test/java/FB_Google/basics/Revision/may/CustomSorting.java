package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class CustomSorting {

    public static void main(String[] args) {
        String order = "cba", s = "Wabcdc";
        CustomSorting cSort = new CustomSorting();
        cSort.sort(s,order);
    }

    private void sort(String s, String order) {
        List<Character> li = new ArrayList<Character>();

        for(int k=0;k<s.length();k++)
        {
            li.add(s.charAt(k));
        }
        StringBuilder sb = new StringBuilder();
        for(int k=0;k<order.length();k++)
        {
            if(li.contains(order.charAt(k)))
            {
                sb.append(order.charAt(k));
                Character ch = order.charAt(k);
                li.remove(ch);
            }
        }
        for(Character c: li)
        {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}

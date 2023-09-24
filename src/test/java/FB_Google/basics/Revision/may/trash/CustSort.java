package FB_Google.basics.Revision.may.trash;
import java.util.*;
/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class CustSort {
    public static void main(String[] args) {
        CustSort cs = new CustSort();
        String order = "cba", s = "Wabcdc";
        String res = cs.customSortString(order,s);
        System.out.println(res);
    }

    private String customSortString(String order, String s) {
        ArrayList<Character> al = new ArrayList<Character>();
        for(int k=0;k<s.length();k++)
        {
           al.add(s.charAt(k));
        }
        StringBuilder sb = new StringBuilder();
       for(int k=0;k<order.length();k++)
       {
          while(al.contains(order.charAt(k)))
           {
               Character c = order.charAt(k);
               sb.append(c);
               al.remove(c);
           }
       }
       for(Character c : al)
       {
           sb.append(c);
       }
        return sb.toString();
    }
}

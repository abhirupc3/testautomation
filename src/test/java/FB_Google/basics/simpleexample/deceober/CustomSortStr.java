package FB_Google.basics.simpleexample.deceober;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author achatterjee ON 12/2/22
 * @project testautomation
 */
public class CustomSortStr {
    public static void main(String[] args) {
        String order = "cba", s = "Wabcdc";
        CustomSortStr cs = new CustomSortStr();
        cs.sort(s,order);
    }

    private void sort(String s, String order) {
        List<Character> l = new ArrayList<Character>();
        for(int  m=0;m<s.length();m++)
        {
            l.add(s.charAt(m));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<order.length();i++)
        {
            char c = order.charAt(i);
            if(l.contains(c))
            {
                Character ch = order.charAt(i);
                sb= sb.append(ch);
                l.remove(ch);
            }
        }
        for(int k=0;k<l.size();k++)
        {
            sb.append(l.get(k));
        }
        System.out.println("The ordered String is: "+sb.toString());
    }
}

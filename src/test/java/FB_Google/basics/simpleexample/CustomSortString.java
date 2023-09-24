package FB_Google.basics.simpleexample;

import java.util.ArrayList;

/**
 * @author achatterjee ON 2/14/22
 * @project testautomation
 * https://leetcode.com/problems/custom-sort-string/
 */
public class CustomSortString {
    public static void main(String[] args) {
        String s1 = "AAbcde";
        s1=s1.replace("A","");
        System.out.println(s1);
        CustomSortString cs = new CustomSortString();
        String order = "cba", s = "Wabcdc";
        String res = cs.customSortString(order,s);
        System.out.println("The output is: \n");
        System.out.println(res);
    }
    public String customSortString(String order, String s) {
        ArrayList<Character> charList  = new ArrayList<>();
        for(int pos =0 ;pos<s.length();pos++)
        {
            charList.add(s.charAt(pos));
        }
        StringBuilder sb = new StringBuilder();
        for(int pos=0;pos<order.length();pos++)
        {
            while(charList.contains(order.charAt(pos)))
            {
                sb.append(order.charAt(pos));
                Character c = order.charAt(pos);
                charList.remove(c);
            }
        }
        for(Character c: charList)
        {
            sb.append(c);
        }
        String ss = sb.toString();
        return ss;
    }
}

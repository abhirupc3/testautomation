package FB_Google.basics.simpleexample.practice.new1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author achatterjee ON 2/18/22
 * @project testautomation
 */
public class CustSort {

    public static void main(String[] args) {
        CustSort cs = new CustSort();
        List<Character> li = new ArrayList<>();
        Character c = new Character('B');
        String op = cs.sort("cbafg","abacd");
        System.out.println(op);
    }


    public String sort(String order, String st)
    {
        char[] ordArr = order.toCharArray();
        List<Character> li = new ArrayList<>();
        for(int pos=0;pos<st.length();pos++)
        {
            li.add(st.charAt(pos));
        }
        StringBuilder sb = new StringBuilder();
       for(char o:ordArr)
       {
           if(li.contains(o)) {
               sb.append(String.valueOf(o));
               li.remove(new Character(o));
           }
       }
        for(char c:li)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}

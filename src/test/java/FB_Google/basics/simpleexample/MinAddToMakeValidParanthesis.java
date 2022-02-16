package FB_Google.basics.simpleexample;

import java.util.*;

/**
 * @author achatterjee ON 2/8/22
 * @project testautomation
 */
public class MinAddToMakeValidParanthesis {

    public static void main(String[] args) {
        int s = minAddToMakeValid("(((((((((((((((())");
        System.out.println(s);
    }

    public static int minAddToMakeValid(String s) {
        Stack<Integer> st = new Stack<Integer>();
        List<Integer> unMatchedIndex = new ArrayList<>();
        for(int m =0;m<s.length();m++)
        {
            if(s.charAt(m)=='(')
            {
                st.push(m);
            } else if(s.charAt(m)==')')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                } else{
                    unMatchedIndex.add(m);
                }
            }
        }
        while(!st.isEmpty())
        {
            unMatchedIndex.add(st.pop());
        }

        return unMatchedIndex.size();
    }
}

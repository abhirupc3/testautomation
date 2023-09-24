package FB_Google.basics.simpleexample;

import java.util.*;

/**
 * @author achatterjee ON 2/8/22
 * @project testautomation
 */
public class MinAddToMakeValidParanthesis {

    public static void main(String[] args) {
        int s = minAddToMakeValid("((((((((()((((((())))))))))))))))))))))))))))");
        System.out.println(s);
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<Character>();
        List<Character> unMatchedIndex = new ArrayList<Character>();
        for(int m =0;m<s.length();m++)
        {
            if(s.charAt(m)=='(')
            {
                st.push('(');
            } else if(s.charAt(m)==')')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                } else{
                    unMatchedIndex.add(')');
                }
            }
        }

        return (unMatchedIndex.size()+st.size());
    }
}

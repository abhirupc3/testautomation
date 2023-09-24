package FB_Google.basics.simpleexample;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author achatterjee ON 2/6/22
 * @project testautomation
 * Example 1:
 * <p>
 * Input: s = "lee(t(c)o)de)"
 * Output: "lee(t(c)o)de"
 * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
 * Example 2:
 * <p>
 * Input: s = "a)b(c)d"
 * Output: "ab(c)d"
 */
public class ParenthasisAdjustment {
    public static void main(String[] args) {
    String s = "lee(t(c)o)de)";
        System.out.println(s);
    StringBuilder formatted = formatString(s);
    System.out.println(formatted.toString());
}

    private static StringBuilder formatString(String s) {
        Set<Integer> removeIndex = new HashSet<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == '(') {
                st.push(y);
            } else if(s.charAt(y) == ')'){
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    removeIndex.add(y);
                }
            }
        }
        while(!st.isEmpty())
        {
            removeIndex.add(st.pop());
        }
        StringBuilder sb = new StringBuilder();
        for(int m=0;m<s.length();m++)
        {
            if(!removeIndex.contains(m))
            {
                sb.append(s.charAt(m));
            }
        }
        return sb;
    }
}

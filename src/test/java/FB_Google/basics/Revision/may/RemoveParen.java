package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class RemoveParen {
    public static void main(String[] args) {
        String s = "(((()()()(((((";

        Stack<Character> st = new Stack<Character>();
        for(int k=0;k<s.length();k++)
        {
            if(s.charAt(k)=='(')
            {
                st.push('(');
            }// if()
        }
    }
}

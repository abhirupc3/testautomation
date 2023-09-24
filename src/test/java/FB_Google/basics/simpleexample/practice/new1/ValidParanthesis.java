package FB_Google.basics.simpleexample.practice.new1;

import java.util.Stack;

/**
 * @author achatterjee ON 2/22/22
 * @project testautomation
 */
public class ValidParanthesis {
    public static void main(String[] args) {
        int s = minAddToMakeValid("(((((((((((((((())");
        System.out.println(s);
    }

    private static int minAddToMakeValid(String s) {

        char[] ch = s.toCharArray();
        Stack<Character> chSt = new Stack<Character>();
        Stack<Character> unMatchedSt = new Stack<Character>();

        for(int p=0;p<ch.length;p++)
        {
            char c = ch[p];
            if(c=='(')
            {
                chSt.push(c);
            } else {
                if(!chSt.isEmpty())
                  chSt.pop();
                else
                {
                    unMatchedSt.push(')');
                }
            }


        }
        while(!chSt.isEmpty())
        {
            unMatchedSt.push(chSt.pop());
        }
        return unMatchedSt.size();

    }
}

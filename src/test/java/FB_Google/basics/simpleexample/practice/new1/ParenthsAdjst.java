package FB_Google.basics.simpleexample.practice.new1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author achatterjee ON 2/23/22
 * @project testautomation
 */
public class ParenthsAdjst {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(s);
        StringBuilder formatted = formatString(s);
        System.out.println(formatted.toString());
    }

    private static StringBuilder formatString(String s) {
        List<Integer> li = new ArrayList<>();
        Stack<Integer> indexSt = new Stack<>();

        for(int m=0;m<s.length();m++)
        {
            char c = s.charAt(m);
            if(c=='(')
            {
                indexSt.push(m);
            }  if(c==')')
            {
                if(!indexSt.isEmpty())
                indexSt.pop();
                else{
                    li.add(m);
                }
            }
        }
        for(int t=0;t<indexSt.size();t++)
        {
            li.add(indexSt.pop());
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!li.contains(i))
            {
              sb=sb.append(String.valueOf(c));
            }
        }
        return sb;
    }

}

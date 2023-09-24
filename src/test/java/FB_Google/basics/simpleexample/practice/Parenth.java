package FB_Google.basics.simpleexample.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class Parenth {

    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(s);
        Parenth par = new Parenth();
        par.adjust(s);
    }

    private void adjust(String s) {
        Stack<Integer> st = new Stack<>();
        List<Integer> li = new ArrayList<>();
        for(int y=0;y<s.length();y++)
        {
            if(s.charAt(y)=='(')
            {
                st.push(y);
            } else if(s.charAt(y)==')'){
                if(!st.isEmpty())
                {
                    st.pop();
                } else{
                    li.add(y);
                }
            }

        }
        for(int k=0;k<li.size();k++)
        {
            st.push(li.get(k));
        }
        StringBuilder sb = new StringBuilder();
        for(int m=0;m<s.length();m++)
        {
            if(!st.contains(m))
            sb.append(s.charAt(m));
        }
        System.out.println("After Adjustment");
        System.out.println(sb.toString());
    }
}

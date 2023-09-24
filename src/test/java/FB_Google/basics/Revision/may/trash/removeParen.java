package FB_Google.basics.Revision.may.trash;
import java.util.*;
/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class removeParen {
    public static void main(String[] args) {
        String s = "(((((((((((((((())";
        compute(s);
        Stack<Integer> st = new Stack<Integer>();
        List<Integer> li = new ArrayList<Integer>();
        for(int k=0;k<s.length();k++)
        {
          if(s.charAt(k)=='(')
          {
              st.push(k);
          } else
          {
              if(!st.isEmpty())
                  st.pop();
              else
                  li.add(k);
          }
        }

        for(int i: li)
        {
            st.push(i);
        }
        System.out.println("\nThe output is: ");
        for(int m=0;m<st.size();m++)
        {
            System.out.print(st.pop());
        }
       /** for(int k =0; k<s.length();k++)
        {
            if(!st.contains(k))
            {
                System.out.print(s.charAt(k));
            }
        } */
    }



    public static void compute(String s)
    {
        Stack<Integer> st = new Stack<Integer>();
        List<Integer> li = new ArrayList<Integer>();
        for(int k=0;k<s.length();k++)
        {
            if(s.charAt(k)=='(')
            {
                st.push(k);
            } else{
                if(!st.isEmpty())
                    st.pop();
                else
                    li.add(k);
            }
            for(int l: li)
            {
                st.push(l);
            }


        }

        System.out.println("The value is: ");
        for(int m=0;m<st.size();m++)
        {
                System.out.print(st.pop());
        }
       /** for(int m=0;m<s.length();m++)
        {
            if(!st.contains(m))
                System.out.print(s.charAt(st.pop()));
        }*/

    }
}

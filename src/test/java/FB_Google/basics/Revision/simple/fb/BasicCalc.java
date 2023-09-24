package FB_Google.basics.Revision.simple.fb;

import java.util.Stack;

/**
 * @author achatterjee ON 3/12/22
 * @project testautomation
 */
public class BasicCalc {
    public static void main(String[] args) {
        String num = "3+2*2/2+99*2";
        BasicCalc calc =new BasicCalc();
        calc.calculate(num);
    }

    private void calculate(String value) {

        int sum=0;
        int p=0;
        Stack<Integer> valSt = new Stack<>();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<value.length();i++)
        {
            char c = value.charAt(i);

            if(Character.isDigit(c))
            {
              sum= (int) (sum+ Character.getNumericValue(c)*Math.pow(10,p++));
            }  if(!Character.isDigit(c) && !Character.isWhitespace(c) ||i==value.length()-1)
            {
                p=0;
                if(valSt.isEmpty())
                {
                    valSt.push(sum);
                    st.push(c);
                    sum=0;
                    continue;
                }
                switch (st.pop())
                {
                    case '+':
                        valSt.push(sum);
                        break;
                    case '-':
                        valSt.push(sum*(-1));
                        break;
                    case '*':
                        valSt.push(valSt.pop()*sum);
                        break;
                    case '/':
                        valSt.push(valSt.pop()/sum);
                        break;
                }
                sum=0;
                st.push(c);
            }
        }
        sum=0;
        while(!valSt.isEmpty())
        {
            sum=sum+ valSt.pop();
        }
        System.out.println("The value of computation is: "+sum);
    }
}

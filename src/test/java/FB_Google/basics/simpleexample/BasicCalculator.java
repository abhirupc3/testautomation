package FB_Google.basics.simpleexample;

import java.util.Stack;

/**
 * @author achatterjee ON 2/9/22
 * @project testautomation
 * Example 1:
 *
 * Input: s = "3+2*2"
 * Output: 7
 * Example 2:
 *
 * Input: s = " 3/2 "
 * Output: 1
 * Example 3:
 *
 * Input: s = " 3+5 / 2 "
 * Output: 5
 */
public class BasicCalculator {
    public static void main(String[] args) {
       String num = "3+2*2/2+99*2";
  int result = new BasicCalculator().calculate(num);
        System.out.println(result);

    }
    public int calculate(String s) {
        Stack<Integer> elementSt = new Stack<Integer>();
        Stack<Character> operatorSt = new Stack<Character>();
        int presentNumberValue=0;
        int sum = 0;
        for(int counter=0;counter<s.length();counter++)
        {
            char item = s.charAt(counter);
            if(Character.isDigit(item)) {
                presentNumberValue = presentNumberValue * 10 + item - '0';

            }
            if(!Character.isDigit(item) && !Character.isWhitespace(item) || counter ==s.length()-1)
            {
                if(elementSt.isEmpty())
                {
                    elementSt.push(presentNumberValue);
                    operatorSt.push(item);
                    presentNumberValue=0;
                    continue;
                }
               switch(operatorSt.pop())
               {
                   case '+':
                       elementSt.push(presentNumberValue);
                       break;
                   case '-':
                       elementSt.push(presentNumberValue*-1);
                       break;
                   case '*':
                       elementSt.push(elementSt.pop()*presentNumberValue);
                       break;
                   case '/':
                       elementSt.push(elementSt.pop()/presentNumberValue);
                       break;
               }operatorSt.push(item);
                presentNumberValue =0 ;
            }

        }
        while(!elementSt.isEmpty())
        {
            int i = elementSt.pop();
            System.out.print(i+"  ");
            sum=sum+i;
        }
        return sum;
    }
}

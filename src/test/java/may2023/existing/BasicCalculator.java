package may2023.existing;
import java.util.*;
/**
 * @author achatterjee ON 5/1/23
 * @project testautomation
 */

/**
 * Write an algorithm to perform a basic calculator funcationality.
 * Input: s = "3+2*2"
 *   Output: 7
 *   Example 2:
 */
public class BasicCalculator {
    public static void main(String[] args) {
        String s = "3+2*2/2+99*2";
        BasicCalculator bCalc = new BasicCalculator();
        int res = bCalc.getResult(s);
        System.out.println("The value of result is: "+res);
    }

    private int getResult(String s) {

        int presentVal = 0;
        Stack<Integer> elSt = new Stack<Integer>();
        Stack<Character> opSt = new Stack<Character>();
        for (int m=0;m<s.length();m++)
        {
            char item=s.charAt(m);
            if(Character.isDigit(item))
                presentVal = presentVal*10+Character.getNumericValue(item);
            if(!Character.isDigit(item) && !Character.isWhitespace(item) || m==s.length()-1)
            {
               if(elSt.isEmpty())
               {
                   elSt.push(presentVal);
                   opSt.push(item);
                   presentVal=0;
                   continue;
               }
               switch (opSt.pop())
               {
                   case '+':
                        elSt.push(presentVal);
                         break;
                   case '*':
                        elSt.push(elSt.pop()*presentVal);
                        break;
                   case '/':
                       elSt.push(elSt.pop()/presentVal);
                       break;
                   case '-':
                       elSt.push(-1*presentVal);
                       break;
               } presentVal=0;
                 opSt.push(item);
            }
        }
        int sum=0;
        for(int i: elSt)
        {
            sum=sum+i;
        } return sum;
    }
}

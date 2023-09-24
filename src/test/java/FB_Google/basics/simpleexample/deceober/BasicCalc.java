package FB_Google.basics.simpleexample.deceober;

import java.lang.invoke.SwitchPoint;
import java.util.Stack;

/**
 * @author achatterjee ON 12/1/22
 * @project testautomation
 */
public class BasicCalc {
    public static void main(String[] args) {
        BasicCalc bcalc = new BasicCalc();
        String input = "3+2*2/2+99*2";
        int value = bcalc.calculate(input);
        System.out.println("The calculated value is: "+ value);
    }

    private int calculate(String input) {
        Stack<Integer> eleSt = new Stack<Integer>();
        Stack<Character> opSt = new Stack<Character>();
        int sum=0;
        int presentVal=0;
        for(int m=0;m<input.length();m++)
        {
            char item = input.charAt(m);
            if(Character.isDigit(item))
            {
                presentVal = presentVal*10+Character.getNumericValue(item);
            }
            if(!Character.isDigit(item) && !Character.isWhitespace(item)|| m==input.length()-1)
            {
                if(eleSt.isEmpty())
                {
                    eleSt.push(presentVal);
                    opSt.push(item);
                    presentVal=0;
                    continue;
                }
                switch (opSt.pop())
                {
                    case '+':
                          eleSt.push(presentVal);
                          break;
                    case '-':
                        eleSt.push(presentVal*-1);
                        break;
                    case '*':
                        eleSt.push(eleSt.pop()*presentVal);
                        break;
                    case '/':
                        eleSt.push(eleSt.pop()/presentVal);
                        break;
                } presentVal=0;
                opSt.push(item);
            }
        }
        while(!eleSt.isEmpty())
        {
            sum=sum+ eleSt.pop();
        }
        return sum;
    }
}

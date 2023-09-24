package FB_Google.basics.simpleexample.practice.new1;

import io.cucumber.messages.internal.com.fasterxml.jackson.databind.introspect.TypeResolutionContext;

import java.util.Stack;

/**
 * @author achatterjee ON 2/18/22
 * @project testautomation
 */
public class BasicCalculator {

    public static void main(String[] args) {
        BasicCalculator bc = new BasicCalculator();
        int res = bc.compute("12+15*2+4/2");
        System.out.println(res);
    }
    public int compute(String s3)
    {
        int result = 0;
        Stack<Integer> elSt = new Stack<>();
        Stack<Character> opSt = new Stack<>();
        int num=0;

        for(int c=0; c<s3.length();c++)
        {
            char n = s3.charAt(c);

            if(Character.isDigit(n))
            {
                num = num*10+Character.getNumericValue(n);
            }
            if(!Character.isDigit(n) && !Character.isWhitespace(n) || c==s3.length()-1) {
                if (elSt.isEmpty()) {
                    elSt.push(num);
                    num = 0;
                    opSt.push(n);
                    continue;
                }
                if (!opSt.isEmpty()) {
                    switch (opSt.pop()) {
                        case '/': {
                            int temp = elSt.pop();
                            temp = temp / num;
                            elSt.push(temp);
                            break;
                        }
                        case '*': {
                            int temp = elSt.pop();
                            temp = temp * num;
                            elSt.push(temp);
                            break;
                        }
                        case '+': {
                            elSt.push(num);
                            break;
                        }
                        case '-': {
                            elSt.push(num * (-1));
                            break;
                        }
                    }
                    num = 0;
                    opSt.push(n);
                }
            }
        }
        for(int m: elSt)
        {
            result = result+m;
        }
        return result;
    }
}

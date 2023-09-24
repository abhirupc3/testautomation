package FB_Google.basics.simpleexample.practice;

import java.util.Stack;

/**
 * @author achatterjee ON 2/13/22
 * @project testautomation
 */
public class BasicCalc {
    public static void main(String[] args) {
        BasicCalc bc = new BasicCalc();
        String exp = "*12*2";
        double result = bc.compute(exp);
        System.out.println(result);
    }

    private double compute(String exp) {
        Stack<Integer> valueSt = new Stack();
        Stack<Character> opSt = new Stack<Character>();
        int number = 0;

        for(int pos=0;pos<exp.length();pos++)
        {
            char element = exp.charAt(pos);
            if(Character.isDigit(element))
            {
                number = number*10+Character.getNumericValue(element);
            }
            if(!Character.isDigit(element) && !Character.isWhitespace(element) || pos==exp.length()-1)
            {
                if(valueSt.isEmpty())
                {
                    if(number==0)
                        continue;
                   valueSt.push(number);
                   opSt.push(element);
                   number=0;
                   continue;
                }
                if(!opSt.isEmpty()){
                switch(opSt.pop()){
                    case '*':
                        int temp = valueSt.pop();
                        valueSt.push(temp*number);
                        break;
                    case '/':
                         temp = valueSt.pop();
                        valueSt.push(temp/number);
                        break;
                    case '+':
                        temp = valueSt.pop();
                        valueSt.push(temp+number);
                        break;
                    case '-':
                        temp = valueSt.pop();
                        valueSt.push(temp-number);
                        break;
                }}else {
                    valueSt.push(number);
                    opSt.push(element);
                    number = 0;
                }
            }
        }
        double result = 0;
        for(double value: valueSt)
        {
            result=result+value;
        }
    return result;
    }
}

package FB_Google.basics.simpleexample.practice;

import java.util.Stack;

/**
 * @author achatterjee ON 3/4/22
 * @project testautomation
 */
public class BasCalc {
    public static void main(String[] args) {
        BasCalc bc = new BasCalc();
        String exp = "*24*2";
        double result = bc.compute(exp);
        System.out.println(result);
    }

    private double compute(String exp) {
        char[] st = exp.toCharArray();
        Stack<Integer> numSt = new Stack<Integer>();
        Stack<Character> opSt = new Stack<Character>();
        int digit = Integer.MAX_VALUE;
        for (int i = 0; i < st.length; i++) {
            char j = st[i];

            if (Character.isDigit(j)) {
                digit = digit * 10 + Character.getNumericValue(j);
            }
            if (!Character.isDigit(j) && !Character.isWhitespace(j) || i == st.length - 1) {
                if (numSt.isEmpty()) {
                    if(digit!=Integer.MAX_VALUE){
                    numSt.push(digit);
                    opSt.push(j);
                    }
                    digit=0;
                    continue;
                }
                switch (opSt.pop()) {
                    case '+':
                        numSt.push(digit);
                        break;
                    case '-':
                        numSt.push(digit * -1);
                        break;
                    case '*':
                        numSt.push(numSt.pop() * digit);
                        break;
                    case '/':
                        numSt.push(numSt.pop() / digit);
                        break;
                }
                // Reset
                digit = 0;
                opSt.push(j);
            }
        }
        int sum = 0;
        while (!numSt.isEmpty()) {
            sum = sum + numSt.pop();
        }
        return sum;
    }
}

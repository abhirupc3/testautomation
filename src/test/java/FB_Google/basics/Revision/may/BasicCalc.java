package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class BasicCalc {

    public static void main(String[] args) {
        String num = "3+2*2/2+99*2";
        BasicCalc bc = new BasicCalc();
        bc.calculate(num);
    }

    private void calculate(String num) {
        Stack<Integer> itemSt = new Stack<Integer>();
        Stack<Character> opSt = new Stack<Character>();
        int presentValue = 0;
        for (int k = 0; k < num.length(); k++) {
            char c = num.charAt(k);

            if (Character.isDigit(c)) {
                presentValue = presentValue * 10 + Character.getNumericValue(c);
            }  if (!Character.isDigit(c) || k == num.length() - 1) {
                if (itemSt.isEmpty()) {
                    itemSt.push(presentValue);
                    opSt.push(c);
                    presentValue = 0;
                    continue;
                }
                switch (opSt.pop()) {
                    case '+':
                        itemSt.push(presentValue);
                        break;
                    case '-':
                        itemSt.push(presentValue * -1);
                        break;
                    case '/':
                        itemSt.push(itemSt.pop() / presentValue);
                        break;
                    case '*':
                        itemSt.push(itemSt.pop() * presentValue);
                        break;
                }
                presentValue = 0;
                opSt.push(c);
            }
        }
        int result = 0;
        while(!itemSt.isEmpty()) {
            result = result + itemSt.pop();
        }
        System.out.println("The sum is: " + result);
    }
}

package FB_Google.basics.simpleexample;
import java.util.List;
import java.util.ArrayList;
/**
 * @author achatterjee ON 2/6/22
 * @project testautomation
 * Input: s = "42"
 * Output: 42
 * Explanation: The underlined characters are what is read in, the caret is the current reader position.
 * Step 1: "42" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "42" ("42" is read in)
 *            ^
 * The parsed integer is 42.
 * Since 42 is in the range [-231, 231 - 1], the final result is 42.
 */
public class StringToNum {
    public static void main(String[] args) {
        String numStr = "-1225";
        int intNum=0;
        for(int m=0;m<numStr.length();m++)
        {
            if(!isNum(numStr.charAt(m)))
            {
                System.out.println("Not a number");
            }
            intNum = (int) (intNum+Character.getNumericValue(numStr.charAt(m))*Math.pow(10,(numStr.length()-1)-m));
        }
        if(intNum<0)
        {
            intNum = (int)(intNum+Math.pow(10,numStr.length()-1));
            intNum = intNum*-1;
        }
        System.out.println("The value of Integer is: "+intNum);
    }
    public static boolean isNum(char c)
    {
        List<Integer> li = new ArrayList<Integer>();
        for(int i=48;i<58;i++)
        {
            li.add(i);
        }
        li.add(45);
        int n = c;

        return li.contains(n);
    }
}

package FB_Google.basics.Revision.may.trash;
import java.util.*;
/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class BasicCalc {
    public static void main(String[] args) {
        String num = "3+2*2/2+99*2";
        BasicCalc bc = new BasicCalc();
        bc.calc(num);
    }

    private void calc(String num) {

        int presentVal = 0;
        char[] c = num.toCharArray();
        Stack<Character> opSt = new Stack<Character>();
        Stack<Integer> eleSt = new Stack<Integer>();
        for(int k=0;k<c.length;k++)
        {

            if(Character.isDigit(c[k]))
            {
                presentVal=presentVal*10+Character.getNumericValue(c[k]);
            }
            if(!Character.isDigit(c[k]) || k==c.length-1)
            {
               if(eleSt.isEmpty())
               {
                   eleSt.add(presentVal);
                   opSt.add(c[k]);
                   presentVal=0;
                   continue;
               }
               switch(opSt.pop())
               {
                   case '+':
                       eleSt.push(presentVal);
                       break;
                   case '-':
                       eleSt.push(presentVal);
                       break;
                   case '/':
                       eleSt.push(eleSt.pop()/presentVal);
                       break;
                   case '*':
                       eleSt.push(eleSt.pop()*presentVal);
                       break;
               }
               presentVal=0;
               opSt.push(c[k]);
            }




        }
        int sum = 0;
        for(int i: eleSt)
        {
            sum=sum+i;
        }
        System.out.println(sum);

    }
}

package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/13/22
 * @project testautomation
 * Example 1:
 *
 * Input: num1 = "11", num2 = "123"
 * Output: "134"
 * Example 2:
 *
 * Input: num1 = "456", num2 = "77"
 * Output: "533"
 * Example 3:
 *
 * Input: num1 = "0", num2 = "0"
 * Output: "0"
 */
public class AddStrings {
    public static void main(String[] args) {
        AddStrings as = new AddStrings();
        String num1 =  "123456789", num2 = "123";
        String res = as.addStrings(num1,num2);
        System.out.println(res);
    }
    public String addStrings(String num1, String num2) {

       int length = Math.max(num1.length(),num2.length());
       String longerSt = "";
       String shorterSt = "";
       if(num1.length()>=num2.length())
       {
           longerSt = num1;
           shorterSt = num2;
       } else{
           longerSt = num2;
           shorterSt = num1;
       }
       int sum=0;
       int carry =0 ;
        StringBuilder result = new StringBuilder();
        int c = shorterSt.length()-1;
       for(int pos =longerSt.length()-1;pos>=0;pos--)
       {
           int operand1 = Character.getNumericValue(longerSt.charAt(pos));
           int operand2 = c>=0 ? Character.getNumericValue(shorterSt.charAt(c--)):0;
           int temp = sum+operand1+operand2+carry;
           sum = temp%10;
           carry = temp/10;
           result.append(String.valueOf(sum));
           sum=0;
       }
       String res =  carry!=0 ? result.append(carry).reverse().toString():result.reverse().toString();

       return res;
    }


}

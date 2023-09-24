package may2023.existing;
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
/**
 * @author achatterjee ON 5/1/23
 * @project testautomation
 */
public class StringSum {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "111111111";
        StringSum ss = new StringSum();
        ss.add(s1,s2);
    }

    private void add(String s1, String s2) {
        int length = Integer.max(s1.length(),s2.length());
        int sum=0,carry=0;
        StringBuilder sb = new StringBuilder();
        for(int m=0;m<length;m++)
        {
            int k=1;
            int item1=0;
            int item2=0;
            if(m<s1.length())
                item1 = Character.getNumericValue(s1.charAt(m));

            if(m<s2.length())
                item2 = Character.getNumericValue(s2.charAt(m));
            int temp = (item1+item2);
            sum = temp%10;
            carry = temp/10;
            sb.append(sum);
        }
        String value = carry ==0 ?sb.reverse().toString():sb.append(carry).reverse().toString();
        System.out.println("The sum is: "+ value);
    }
}

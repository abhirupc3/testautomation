package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/5/22
 * @project testautomation
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int num=120;
        int rev = rev(num);
        System.out.println(rev);
    }

    private static int rev(int num) {
        int sum=0;
        while(num!=0)
        {
            sum = sum*10+num%10;
            num=num/10;
        }
        return sum;
    }
}

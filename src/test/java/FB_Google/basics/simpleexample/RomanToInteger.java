package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/6/22
 * @project testautomation
 *input  xxiv output 24
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 *
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "XXVI";
        int sum=s.length()==1?getNumber(s.charAt(s.length()-1)):0;
        for(int m = s.length()-1; m>=0;m--)
        {
            int num1 = getNumber(s.charAt(m));
            if(m==s.length()-1)
            {
                sum = num1;
            }
            else {
                int num2 = getNumber(s.charAt(m + 1));
                if (num1 >= num2) {
                    sum = sum  + num1;
                } else {
                    sum = sum - num1;
                }
            }
        }
        System.out.println("The Integer Number Is: "+ sum);
    }

    public static int getNumber(char c)
    {
        int num = 0;
        switch (c) {
            case 'I' :
                num=1;
                break;
            case 'V':
                num=5;
                break;
            case 'X':
                num=10;
                break;
            case 'L':
                num=50;
                break;
            case 'C':
                num=100;
                break;
            case 'D':
                num=500;
                break;
            case 'M':
                num=1000;
                break;

        }
        return num;
    }
}

package FB_Google.basics.simpleexample.practice;

import FB_Google.basics.simpleexample.AddStrings;

/**
 * @author achatterjee ON 3/4/22
 * @project testautomation
 */
public class StrSum {
    public static void main(String[] args) {
        StrSum as = new StrSum();
        String num1 =  "123456789", num2 = "123";
        String res = as.addStrings(num1,num2);
        System.out.println(res);
    }

    private String addStrings(String num1, String num2) {
        char[] largeNum = num1.length()>num2.length() ? num1.toCharArray():num2.toCharArray();
        char[] smallNum = num1.length()<num2.length() ? num1.toCharArray():num2.toCharArray();
        int sum=0;
        int carry=0;
        int c = smallNum.length-1;
        StringBuilder sb = new StringBuilder();
        for(int i=largeNum.length-1;i>=0;i--)
        {
            int d1 = 0;
            int d2=0;
            if(!Character.isDigit(largeNum[i]))
            {
                System.out.println("Not a number");
                return null;
            }
            if(c>=0 && !Character.isDigit(smallNum[c]))
            {
                System.out.println("Not a number");
                return null;
            }
            d1 = Character.getNumericValue(largeNum[i]);
            d2 = c>=0?Character.getNumericValue(largeNum[c]):0;
            int x = d1+d2+carry;
            sum=x%10;
            carry=x/10;
            sb.append(sum);
            c--;
        }
        if(carry!=0)
            sb.append(carry);
     String r =    sb.reverse().toString();
     return r;
    }
}

package FB_Google.basics.Revision.may.trash;

import FB_Google.basics.simpleexample.AddStrings;

/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class adStr {
    public static void main(String[] args) {
        adStr as = new adStr();
        String num1 =  "123456789", num2 = "123";
        as.add(num1,num2);
    }

    private void add(String num1,String num2) {
        String ls="";
        String ss = "";
        if(num1.length()>=num2.length())
        {
            ls=num1;
            ss=num2;
        } else{
            ls=num2;
            ss=num1;
        }
        int sum=0;
        int carry=0;
        StringBuilder sb = new StringBuilder();
        int c=ss.length()-1;
        for(int k=ls.length()-1;k>=0;k--)
        {
            int p = Character.getNumericValue(ls.charAt(k));
            int q = c>=0?Character.getNumericValue(ss.charAt(c--)):0 ;
            sum=(p+q+carry)%10;
            carry=(p+q)/10;
            sb.append(sum);

        } if(carry!=0)
            sb.append(carry);

        System.out.println(sb.reverse().toString());

    }
}

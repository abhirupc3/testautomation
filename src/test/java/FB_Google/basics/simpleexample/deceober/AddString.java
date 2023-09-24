package FB_Google.basics.simpleexample.deceober;

/**
 * @author achatterjee ON 12/1/22
 * @project testautomation
 */
public class AddString {
    public static void main(String[] args) {
        AddString adSt = new AddString();
        String st1 = "12";
        String st2 = "3";
        String result = adSt.sum( st1,  st2);
        System.out.println("Value of sum is: "+result);
    }

    private String sum(String s1, String s2) {
       if(s2.length()>s1.length())
       {
           String t = s2;
           s2=s1;
           s1=t;
       }
       int sum=0;
       int carry=0;
       int c= s2.length()-1;
       StringBuilder res = new StringBuilder();
       for(int m=s1.length()-1;m>=0;m--)
       {
           int i = Character.getNumericValue(s1.charAt(m));
           int j = c>=0?Character.getNumericValue(s2.charAt(c--)):0;
           sum=i+j+carry;
           carry=sum/10;
           res.append(sum%10);
           sum=0;
       } if(carry!=0)
        {
            res.append(carry);
        }
       return res.reverse().toString();
    }
}

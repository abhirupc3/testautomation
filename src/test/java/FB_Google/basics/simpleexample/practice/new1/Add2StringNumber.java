package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/17/22
 * @project testautomation
 */
public class Add2StringNumber {
    public static void main(String[] args) {
        Add2StringNumber add = new Add2StringNumber();
        add.adddNum("123","59");
    }

    public void adddNum(String s1, String s2)
    {
        int sum=0;
        int carry = 0;
        String longS;
        String shortS;
        if(s1.length()>=s2.length())
        {
            longS=s1;
            shortS=s2;
        } else{
            longS=s2;
            shortS=s1;
        }
        int c=shortS.length()-1;
        StringBuilder sb = new StringBuilder();
        for(int p=longS.length()-1;p>=0;p--)
        {
            int num1 = Character.getNumericValue(longS.charAt(p));
            int num2 = c>=0? Character.getNumericValue(shortS.charAt(c--)):0;
            sum = num1+num2+carry;
            carry = sum/10;
            sum=sum%10;

            sb.append(sum);
            sum=0;
        }
        if(carry!=0)
        sb.append(carry);
        sb = sb.reverse();
        System.out.println("The sum is: "+sb.toString());
    }
}

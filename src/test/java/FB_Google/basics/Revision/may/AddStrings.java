package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class AddStrings {
    public static void main(String[] args) {
        AddStrings as = new AddStrings();
        String num1 =  "999", num2 = "1";
        String result = as.addString(num1,num2);
        System.out.println(result);
    }

    private String addString(String num1, String num2) {


        String ls ;
        String ss;
        if(num1.length()>=num2.length())
        {
            ls=num1;
            ss=num2;
        } else{
            ls=num2;
            ss=num1;
        }
        StringBuilder sb = new StringBuilder();
        int carry=0; int counter=ss.length()-1;
        for(int k=ls.length()-1; k>=0;k--)
        {
            int n1 = Character.getNumericValue(ls.charAt(k));
            int n2 = counter>=0?Character.getNumericValue(ss.charAt(counter)):0;
            int sum = (n1+n2+carry)%10;
            carry = (n1+n2+carry)/10;
            sb.append(sum);
            counter--;
        }
        String result="";
        if(carry!=0)
        {
            result = sb.append(carry).reverse().toString();
        } else{
            result = sb.reverse().toString();
        }
        return result;
    }
}

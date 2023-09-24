package FB_Google.basics.Revision.simple.fb;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class AddString {
    public static void main(String[] args) {
        String s1="12345678";
        String s2 = "345678";
        AddString add = new AddString();
        String sum = add.sum(s1,s2);
        System.out.println("The sum of "+s1+" And "+ s2+" is: "+sum);
    }

    private String sum(String s1, String s2) {
        int sum=0;
        int carry=0;
        String longS = s1.length()>s2.length()?s1:s2;
        String shortS = s1.length()<s2.length()?s1:s2;;
        String s = "";
        int p=shortS.length()-1;
        for(int y=longS.length()-1;y>=0;y--)
        {
            int n1 = Character.getNumericValue(longS.charAt(y));
            int n2=0;
            if(p>=0)
            {
              n2 =   Character.getNumericValue(shortS.charAt(p--));
            }
            sum=sum+n1+n2+carry;
            carry=sum/10;
            sum=sum%10;

            s = String.valueOf(sum)+s;
            sum=0;
        }
        if(carry>0)
        {
            s=String.valueOf(carry)+s;
        }
        return s;
    }
}

package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class StringToNum {
    public static void main(String[] args) {
        StringToNum s2n = new StringToNum();
        String val = "1-23";
        int num = s2n.s2N(val);
        System.out.println(num);
    }

    private int s2N(String val) {
        int num=0;
        for(int k=0;k<val.length();k++)
        {
            char c = val.charAt(k);
            if((!Character.isDigit(c) && k>0)) {
                System.out.println("Not a Number");
                break;
            }
            num= (int) (num + Character.getNumericValue(c)*Math.pow(10,(val.length()-1)-k));
        }
        if(num<0)
        {
            num =(int)(num +Math.pow(10,val.length()-1));
            num=num*-1;
        }
        return num;
    }
}

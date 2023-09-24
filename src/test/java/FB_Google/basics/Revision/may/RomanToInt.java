package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class RomanToInt {
    public static void main(String[] args) {
        String s = "XXVI";
        RomanToInt r2i = new RomanToInt();
        int sum=0;
        for(int k=s.length()-1; k>=0;k--)
        {
            int num1 = r2i.getInt(s.charAt(k));
            if(k==s.length()-1)
            {
              sum=num1;
            } else{
                int num2 = r2i.getInt(s.charAt(k+1));
                if(num1>=num2)
                {
                    sum=sum+num1;
                }
            }
        }
        System.out.println(sum);
    }



    public int getInt(char c)
    {
        switch(c) {
            case 'X':
                 return 10;
            case 'I':
                return 1;
            case 'V':
                return 5;
            default:
                return -1;
        }

    }
}

package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class DigiSum {
    public static void main(String[] args) {
        int digit = 1234,sum=0;
        while(digit!=0)
        {
           sum=sum+digit%10;
           digit=digit/10;
        }
        System.out.println(sum);
    }
}

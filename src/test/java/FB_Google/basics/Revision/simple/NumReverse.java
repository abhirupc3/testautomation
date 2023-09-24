package FB_Google.basics.Revision.simple;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class NumReverse {
    public static void main(String[] args) {
        int x = 123456;
        int rev=0;
        while(x!=0)
        {
            rev=rev*10+x%10;
            x=x/10;
        }
        System.out.println("The original number :123456");
        System.out.println("The number after reverse: "+rev);
    }
}

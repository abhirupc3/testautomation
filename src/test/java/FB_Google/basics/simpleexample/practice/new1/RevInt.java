package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/23/22
 * @project testautomation
 */
public class RevInt {
    public static void main(String[] args) {
        int i = 1234;
        int rev=0;

        while(i!=0)
        {
            int x = i%10;
            rev=rev*10+x;
            i=i/10;

        }
        System.out.println(rev);
    }
}

package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class IntRev {
    public static void main(String[] args) {


        int in = 1234;
        int rev = 0;
        while (in != 0) {
            rev = rev * 10 + in % 10;
            in = in / 10;
        }
        System.out.println(rev);

    }
}

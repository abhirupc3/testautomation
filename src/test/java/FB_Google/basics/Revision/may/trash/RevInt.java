package FB_Google.basics.Revision.may.trash;

/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class RevInt {
    public static void main(String[] args) {
        int i=1234; int rev=0;
        while(i!=0)
        {
            rev=rev*10+i%10;
            i=i/10;
        }
        System.out.println(rev);
    }
}

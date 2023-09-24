package FB_Google.basics.Revision.may.trash;

/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class DigiSum {
    public static void main(String[] args) {
        int i=12345; int sum=0;
        while(i!=0)
        {
            sum = sum + i%10;
            i=i/10;
        }
        System.out.println(sum);
    }
}

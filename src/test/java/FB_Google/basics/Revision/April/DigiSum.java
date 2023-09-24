package FB_Google.basics.Revision.April;

/**
 * @author achatterjee ON 4/19/22
 * @project testautomation
 */
public class DigiSum {
    public static void main(String[] args) {
        int i=1234;
        digiSum(i);
    }

    private static void digiSum(int i) {
        int sum=0;
        while(i!=0) {
            sum=sum+i%10;
            i=i/10;
        }
        System.out.println("DigiSum is: "+sum);
    }
}

package FB_Google.basics.simpleexample.deceober;

/**
 * @author achatterjee ON 12/2/22
 * @project testautomation
 */
public class DigiSum {
    public static void main(String[] args) {
         int digit = 1234;
        DigiSum ds = new DigiSum();
        ds.digiSum(digit);
    }

    private void digiSum(int digit) {
        int sum=0;
        while(digit!=0)
        {
            sum=sum+digit%10;
            digit=digit/10;
        }
        System.out.println("The sum of digits is: "+sum);
    }
}

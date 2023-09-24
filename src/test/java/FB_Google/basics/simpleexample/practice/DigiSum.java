package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 2/13/22
 * @project testautomation
 */
public class DigiSum {
    public static void main(String[] args) {
        // int x= 1234 o/p 10;
        int x=1234;
        int result = cpmpute(x);
        System.out.println("Value of sum is: "+result);
    }

    private static int cpmpute(int num) {
        int sum=0;
        while(num!=0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
}

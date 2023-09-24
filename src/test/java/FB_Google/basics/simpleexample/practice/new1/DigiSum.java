package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/19/22
 * @project testautomation
 */
public class DigiSum {
    public static void main(String[] args) {
        int res = new DigiSum().compute(103);
        System.out.println(res);

    }

    public int compute(int digit)
    {
        int sum=0;
        while(digit!=0)
        {
            sum=sum+digit%10;
            digit = digit/10;
        }
        return sum;
    }
}

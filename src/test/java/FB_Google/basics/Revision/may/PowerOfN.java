package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class PowerOfN {
    public static void main(String[] args) {
        PowerOfN pon = new PowerOfN();
        int res =  pon.calculate(2,5);
        System.out.println(res);
    }

    private int calculate(int in, int po) {
        if(po==0)
            return 1;
        if(po==1)
            return in;
        if(po%2==0)
        {
            return calculate(in*in,po/2);
        } else{
            return in*calculate(in*in,po/2);
        }
    }
}

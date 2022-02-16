package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/12/22
 * @project testautomation
 */
public class PowerOfXn {
    public static void main(String[] args) {
        PowerOfXn pow = new PowerOfXn();
        double powRes = pow.pow(34.00515,-3);
        System.out.println(Math.pow(34.00515,-3));
        System.out.println("Value is "+powRes);
    }
    boolean isNeg = false;
    public double pow(double y,double n)
    {
    if(n<0) {
        n = n * -1;
        isNeg=true;
    }
        double result=1;
        {
             if(n==0)
            {
                return 1;
            } else if(n%2==0)
             {
                 double p = pow(y,n/2);
                 result = p*p;
             } else{
                 double q = pow(y,n-1);
                 result = y*q;
             }
        }
        if(isNeg==true)
        result=1/result;
        return result;
    }
}

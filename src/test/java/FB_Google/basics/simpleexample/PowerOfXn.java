package FB_Google.basics.simpleexample;

import FB_Google.basics.simpleexample.practice.Powxn;

/**
 * @author achatterjee ON 2/12/22
 * https://www.youtube.com/watch?v=-3Lt-EwR_Hw
 * https://www.youtube.com/watch?v=GyL7FJn0gso
 * @project testautomation
 */
public class PowerOfXn {
    public static void main(String[] args) {
        PowerOfXn po = new PowerOfXn();
        int x =2;
        int n=3;
        double resu = po.pow(x,n);
        resu = n<0 ? 1/resu:resu;
        System.out.println(resu);
    }

    private int pow(int x, int n) {
        n = Math.abs(n);
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n%2==0)
            return pow(x*x,n/2);
        return x*pow(x*x,n/2);
    }
}

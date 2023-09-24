package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class Powxn {
    public static void main(String[] args) {
        Powxn po = new Powxn();
        int x =2;
        int n=-2;
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

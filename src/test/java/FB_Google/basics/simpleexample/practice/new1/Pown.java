package FB_Google.basics.simpleexample.practice.new1;

import FB_Google.basics.simpleexample.PowerOfXn;

/**
 * @author achatterjee ON 2/23/22
 * @project testautomation
 */
public class Pown {
    public static void main(String[] args) {
        Pown pow = new Pown();
        double powRes = pow.pow(2,3);
        System.out.println(Math.pow(34.00515,-3));
        System.out.println("Value is "+powRes);
    }

    private double pow(double v, int n) {
        boolean isNeg=false;
        if(n==0)
            return 1;
        if(n<=0) {
            isNeg = true;
            n=n*-1;
        }
        double res=1;
        while(n!=0)
        {
           res=res*v;
           n=n-1;
        }
              if(isNeg)
                  res = 1/res;
              return res;
    }
}

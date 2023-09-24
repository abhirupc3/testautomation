package FB_Google.basics.Revision.simple;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class GCD {
    public static void main(String[] args) {
        int [] i = {6,6,12};
        GCD gcd = new GCD();
        int x = i[0];
        int gc = 0;
        for(int p=1;p<i.length;p++) {
            gc = gcd.getGCD(x,i[p]);
        }
        System.out.println("The Value of GCD IS: "+ gc);
    }

    private int getGCD(int x, int y) {
        if(x==0)
            return y;
        return getGCD(y%x,x);
    }
}

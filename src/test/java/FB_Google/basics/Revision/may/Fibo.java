package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/19/22
 * @project testautomation
 */
public class Fibo {

    public static void main(String[] args) {
        Fibo fib = new Fibo();
        for(int k=0 ;k<8;k++) {
            int i = fib.fi(k);
            System.out.println(i);
        }
    }

    private int fi(int k) {

        if(k==0 || k==1)
        {
            return k;
        }
        return fi(k-1)+fi(k-2);

    }
}

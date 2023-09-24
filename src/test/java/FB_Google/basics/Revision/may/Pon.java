package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/19/22
 * @project testautomation
 */
public class Pon {

    public static void main(String[] args) {
        Pon po = new Pon();
        int res =  po.p(2,6);
        System.out.println(res);
    }

    private int p(int p, int n) {

        if(n==0)
            return 1;
        if(n%2==0)
            return p(p*p,n/2);
        else
            return p*p(p*p,n/2);
    }
}

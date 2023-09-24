package FB_Google.basics.Revision.April;

/**
 * @author achatterjee ON 4/19/22
 * @project testautomation
 */
public class GcdLcm {
    public static void main(String[] args) {
        int[] i = {12,18};
        int res = gcd(i[0],i[1]);
        System.out.println(res);
        int res1 = lcm(i[0],i[1]);
        System.out.println(res1);
    }

    private static int lcm(int i, int i1) {
        int r = gcd(i,i1);
        return (i*i1)/r;
    }

    private static int gcd(int n1, int n2) {

        if(n1==0)
            return n2;
       return gcd(n2%n1,n1);

    }
}

package newPreperation.march2022;

/**
 * @author achatterjee ON 2/26/22
 * @project testautomation
 */
public class GCD {


    public static void main(String[] args) {
        int a=12; int b =8;
        int res = gcd(a,b);
        System.out.println(res);
    }

    private static int gcd(int a, int b) {

        while(b!=0)
        {
            int temp = a;
            a=b;
            b=temp%b;

        }
        return a;
    }
}

package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/19/22
 * @project testautomation
 */
public class Factorial {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int re = fact.fact(5);
        System.out.println(re);
    }

    private int fact(int i) {
        if(i==0)
            return 1;
        return i*fact(i-1);

    }

}

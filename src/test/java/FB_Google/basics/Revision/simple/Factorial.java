package FB_Google.basics.Revision.simple;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class Factorial {
    public static void main(String[] args) {
        Factorial fac = new  Factorial();
        int x =5;
        int res1 = fac.fact(x);
        System.out.println("Factorial of "+x +"is: "+ res1);
        res1 = fac.factRec(x);
        System.out.println("Factorial of "+x +"is: "+ res1);
    }

    private int fact(int x) {
        int res=1;
        for(int y=1;y<=x;y++)
        {
            res = res*y;
        }
        return res;
    }
    private int factRec(int x)
    {
        if(x<1)
            return 1;
       return x*factRec(x-1);
    }
}

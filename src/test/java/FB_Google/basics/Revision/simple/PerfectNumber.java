package FB_Google.basics.Revision.simple;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class PerfectNumber {
    public static void main(String[] args) {
        int y=29;
        PerfectNumber pn = new PerfectNumber();
        pn.checkPerfect(y);

    }

    private void checkPerfect(int y) {
        int sum=0;
        for(int i=1;i<y;i++)
        {
            if(y%i==0)
                sum=sum+i;
        }
        if(sum==y)
            System.out.println(y+" Is a perfect Number");
        else
            System.out.println(y+" Is not a perfect Number");
    }
}

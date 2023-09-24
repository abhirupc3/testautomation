package FB_Google.basics.Revision.may.trash;

/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class PON {
    public static void main(String[] args) {
        PON po = new PON();
        System.out.println(po.pow(2,5));
    }

    private int pow(int i, int i1) {

        if(i1==0)
            return 1;

        if (i1%2==0)
            return pow(i*i,i1/2);
        else
            return i*pow(i*i,i1/2);
    }
}

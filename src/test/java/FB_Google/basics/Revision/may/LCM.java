package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class LCM {

    public static void main(String[] args) {
        LCM lc = new LCM();
        int i[] = {12,18,6,6};
        int hc = 0;
        for(int k=2;k<i.length;k++)
        {
         hc =   lc.hcf(lc.hcf(i[k-1],i[k-2]),i[k]);
        }
        int lcf =0;
        for(int k=2;k<i.length;k++)
        {
            lcf =   lc.lc(lc.lc(i[k-1],i[k-2]),i[k]);
        }
        System.out.println("HCF "+hc);
        System.out.println("LCF "+lcf);
    }

    public int hcf(int n1,int n2)
    {
        if(n1==0)
        {
            return n2;
        }
        return hcf(n2%n1,n1);
    }

    public int lc(int n1,int n2)
    {
        return n1*n2/(hcf(n1,n2));
    }
}

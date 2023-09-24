package FB_Google.basics.simpleexample.deceober;

/**
 * @author achatterjee ON 12/2/22
 * @project testautomation
 */
public class HCFLCM {
    public static void main(String[] args) {
        int i[] = {12,18,6,3};
        HCFLCM h = new HCFLCM();
        int hc=0,l=0;
        for(int m=2;m<i.length;m++)
        {
            hc=h.hcf(h.hcf(i[m-1],i[m-2]),m);
        }for(int m=2;m<i.length;m++)
        {
            l=h.lcf(h.lcf(i[m-1],i[m-2]),m);
        }
        System.out.println("HCF is: "+hc);
        System.out.println("LCM is: "+l);
    }
    public int hcf(int n1,int n2)
    {
        if(n1==0) {
            return n2;
        }
        return(hcf(n2%n1,n1));
    }
    public int lcf(int n1,int n2)
    {
        return((n1*n2)/hcf(n1,n2));
    }
}

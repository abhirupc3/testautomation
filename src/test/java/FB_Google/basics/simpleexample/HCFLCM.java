package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 3/7/22
 * @project testautomation
 * https://www.youtube.com/watch?v=RhGWdv48EI4&t=235s
 */
public class HCFLCM {

    public static void main(String[] args) {
        HCFLCM hl = new HCFLCM();
        int i[] = {12,18,6,8};
        int j=i[0];
        int hcf=hl.hcf(i[0],i[1]);
        for(int m =2;m<i.length;m++) {
            hcf = hl.hcf(hcf,i[m]);
        }
        System.out.println("The HCF value is: "+hcf);
        int lcm=0;
        for(int m =2;m<i.length;m++) {
            lcm = hl.lcm(hl.lcm(i[m-1], i[m-2]), i[m]);
        }
        System.out.println("The LCM value is: "+lcm);
    }

    private int lcm(int n1, int n2) {
        int hf = hcf(n1,n2);
        return (n1*n2)/hf;
    }
    private int hcf(int n1, int n2) {
        if(n1==0)
            return n2;
       return hcf(n2%n1,n1);
    }
}

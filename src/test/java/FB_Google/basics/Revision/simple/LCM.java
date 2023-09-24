package FB_Google.basics.Revision.simple;

import java.util.Arrays;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class LCM {
    public static void main(String[] args) {
        LCM lcm = new LCM();
        int p[] = {2,4,8};
        int y=p[0];
        int lc=0;
        for(int c=1;c<p.length;c++) {
            lc = lcm.getLCM(y,p[c]);
        }
        String s = Arrays.toString(p);
        System.out.println("LCM of "+s + " is: "+lc);
    }
    private int getLCM(int y, int i) {
        int gcd = getGCD(y,i);
        return (y*i)/gcd;
    }

    private int getGCD(int y, int i) {
        if(y==0)
            return i;
        return getGCD(i%y,y);
    }
}

package FB_Google.basics.simpleexample.practice.new1;

import FB_Google.basics.simpleexample.MaximumSwap;

/**
 * @author achatterjee ON 2/22/22
 * @project testautomation
 */
public class MaxSwap {
    public static void main(String[] args) {
        MaxSwap m = new MaxSwap();
        int p = m.MaxSwp(5929);
        System.out.println(p);
    }

    private int MaxSwp(int i) {

        int diff=0;
        int st=0;
        int nd=0;
        boolean found=false;
        char c[] = String.valueOf(i).toCharArray();
        for(int k=0;k<c.length;k++)
        {
            for(int m=k+1; m<c.length;m++)
            {
                if(c[k]<c[m] && c[m]-c[k]>=diff)
                {
                    st=k;
                    nd=m;
                    diff=c[m]-c[k];
                    found=true;
                }
            }
            if(found)
            {
                break;
            }
        }

        char c1 = c[st];
        c[st]=c[nd];
        c[nd]=c1;
        int res = Integer.valueOf(String.valueOf(c));
        return res;
    }
}

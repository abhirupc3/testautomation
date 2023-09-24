package FB_Google.basics.Revision.may;

import FB_Google.basics.simpleexample.MaximumSwap;

/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class MaxSwap {
    public static void main(String[] args) {
        MaxSwap m = new MaxSwap();
        int p = m.maximumSwap(8727);
        System.out.println(p);
    }

    private int maximumSwap(int i) {

        char[] c = String.valueOf(i).toCharArray();
        int diff=0;
        int i1=-1;
        int i2=-1; boolean flag=false;
        for(int k=0;k<c.length;k++)
        {
            for(int l=k+1;l<c.length;l++)
            {
                if(c[k]<c[l] && diff<=(c[l]-c[k]))
                {
                    diff = c[l]-c[k];
                    i1=k;
                    i2=l;
                    flag=true;
                }

            }
            if(flag)
                break;
        }
        if(i1>=0 && i2>=0) {
            char c1 = c[i1];
            c[i1] = c[i2];
            c[i2] = c1;
        }
        return Integer.parseInt(String.valueOf(c));
    }
}

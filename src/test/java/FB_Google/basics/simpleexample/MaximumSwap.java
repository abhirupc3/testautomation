package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/14/22
 * @project testautomation
 * https://leetcode.com/problems/maximum-swap/
 * https://www.youtube.com/watch?v=qHDsgxGywf8
 */
public class MaximumSwap {

    public static void main(String[] args) {
        MaximumSwap m = new MaximumSwap();
        int p = m.maximumSwap(1993);
        System.out.println(p);
    }


    public int maximumSwap(int num) {

        char[] n = String.valueOf(num).toCharArray();
        int i=-1;
        int p1=0;
        int p2=0;
        boolean found=false;
        int diff=0;
        for(int pos=0;pos<n.length;pos++)
        {
            for(int j=pos+1;j<n.length;j++)
            {
                if(n[pos]<n[j] && (n[j]-n[pos])>=diff)
                {
                    p1=pos;
                    p2=j;
                    diff=(n[j]-n[pos]);
                    found=true;
                }
            }
            if(found)
                break;
        }
      char c = n[p1];
        n[p1]=n[p2];
        n[p2]=c;
        int number = Integer.parseInt(new String(n));
        return number;
    }
}

package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class PeakEle {
    public static void main(String[] args) {
        int i[] = {1,1,3,6};
      int peak = peak(i);
        System.out.println(peak);
    }

    public static int  peak(int[] i) {
                for(int k=0;k<i.length-1;k++)
    {
        if(i[k]<i[k+1])
        {
            return i[k+1];
        }
    }
    return i[i.length-1];
    }
}

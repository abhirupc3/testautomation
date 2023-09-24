package FB_Google.basics.Revision.April;

/**
 * @author achatterjee ON 4/19/22
 * @project testautomation
 */
public class findPeak {
    public static void main(String[] args) {
        int i[] = {1,1,3,6};
        findPeakElement(i);
    }

    private static void findPeakElement(int[] i) {
        for(int j=0;j<i.length-1;j++)
        {
            if(i[j]>i[j+1])
            {
                System.out.println("The peek element is: "+i[j]);
                return;
            }
        }
        System.out.println("The peek element is: "+i[i.length-1]);

    }
}

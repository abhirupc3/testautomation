package FB_Google.basics.simpleexample.practice.new1;

import FB_Google.basics.simpleexample.FindPeekElement;

/**
 * @author achatterjee ON 2/19/22
 * @project testautomation
 */
public class FindPeak {
    public static void main(String[] args) {
        FindPeak fpe = new FindPeak();
        int i[] = {5,2,3,6};
        boolean res = fpe.findPeakElement(i);
        System.out.println("Peak index is: "+res);
    }

    public boolean findPeakElement(int[] i) {
        for(int m=0;m<i.length-1;m++)
        {
            if(i[m]>i[m+1])
            {
                System.out.println("The Peak is: "+i[m]);
                return true;
            }

        }
        return false;
    }

}

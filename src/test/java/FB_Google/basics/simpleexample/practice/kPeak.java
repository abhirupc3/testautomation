package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 3/5/22
 * @project testautomation
 */
public class kPeak {
    public static void main(String[] args) {
        int i[] = {1,2,3,6};
        int peak = findPeak(i);
        System.out.println(peak);
    }

    private static int findPeak(int[] i) {
        for (int m=0;m<i.length-1;m++)
        {
            if(i[m]>i[m+1])
                return m;
        }
        return i.length-1;
    }
}

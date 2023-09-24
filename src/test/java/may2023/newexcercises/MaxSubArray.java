package may2023.newexcercises;

/**
 * @author achatterjee ON 5/2/23
 * @project testautomation
 */

/**
 * Write an algorithm to find the maximum continous subarray, which gives the largest number.
 * input: {-2,1,-3,4,-1,2,1,-5,4} o/p: 6
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray mxSum = new MaxSubArray();
        mxSum.findMaxSum(a);
    }

    private void findMaxSum(int[] a) {
        int maxendshere=0;
        int maxSoFar=0;
        for(int m=0;m<a.length;m++) {
            maxendshere = maxendshere + a[m];
            if (maxendshere < 0)
                maxendshere = 0;
            maxSoFar = Integer.max(maxendshere,maxSoFar);
        }
        System.out.println("The max sum is: "+maxSoFar);
    }
}

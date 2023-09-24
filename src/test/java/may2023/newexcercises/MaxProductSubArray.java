package may2023.newexcercises;

/**
 * @author achatterjee ON 5/2/23
 * @project testautomation
 */

/**
 * Write an algorithm to find the maximum product subarray.
 * input: {2,3,-2,4}
 * output: 6
 */
public class MaxProductSubArray {
    public static void main(String[] args) {
        MaxProductSubArray mx = new MaxProductSubArray();
        int[] a = {2,3,-2,4} ;
        mx.maxProduct(a);
    }

    private void maxProduct(int[] a) {
        int maxEndsHere=1;
        int maxSoFar=0;
        for(int m=0 ; m<a.length;m++)
        {
            maxEndsHere= maxEndsHere*a[m];
            if(maxEndsHere<0)
            {
                maxEndsHere=1;
            }
            maxSoFar=Integer.max(maxSoFar,maxEndsHere);
        }
        System.out.println("The max product subarray is: "+maxSoFar);
    }
}

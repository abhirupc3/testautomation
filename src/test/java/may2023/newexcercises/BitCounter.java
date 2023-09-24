package may2023.newexcercises;

/**
 * @author achatterjee ON 5/3/23
 * @project testautomation
 */

/**
 * Given an array of n, count the number of 1s in the binary representation for the each items from 0 to n.
 * for example if input is: 3
 * the output is: 0,1,2
 * Explanation, 0 -> 3 , we have 0, 10,11 (in Binary), hence op is: 0,1,2
 */
public class BitCounter {
    public static void main(String[] args) {
        BitCounter bc = new BitCounter();
        int i = 3;
        bc.count(i);
    }

    private void count(int i) {
        int[] dp = new int[i+1];
        dp[0]=0;
        int offset=1;
        for(int m = 1 ; m<=i ; m++)
        {
           if(offset*2==m)
               offset=m;
           dp[m]=1+dp[m-offset];
        }
        for(int k=0;k<=i;k++)
        {
            System.out.println(dp[k]);
        }
    }
}

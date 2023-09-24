package may2023.newexcercises;

/**
 * @author achatterjee ON 5/3/23
 * @project testautomation
 */
//https://youtu.be/H9bfqozjoqs

import java.util.ArrayList;
import java.util.List;

/**
 * Find the minimum number of coins to get the given number;
 * for examle input {1,3,4,5} and targer is 7
 * o/p: 4,3
 */
public class MinCoin {
    static List<Integer> l = new ArrayList<Integer>();
    public static void main(String[] args) {
        int in[] = {2,3,4,5};
        MinCoin mc = new MinCoin();
        mc.findMin(in,7);

    }

    private void findMin(int[] in, int i) {
       int[] dp = new int[i+1];
        for(int k =1; k<=i;k++)
        {
            dp[k]=Integer.MAX_VALUE;
        }
        for(int l=1;l<=i;l++)
        {
            for(int c=0;c<in.length;c++)
                if(l-in[c]>=0)
                    dp[l]=Integer.min(dp[l],1+dp[l-in[c]]);


        }
       if(dp[i]==Integer.MAX_VALUE)
           System.out.println("-1");
       else
           System.out.println(dp[i]);
    }
}

package may2023.newexcercises;

/**
 * @author achatterjee ON 5/6/23
 * @project testautomation
 */

/**
 * Same as robber one, just first and last house are connected, houses are in circular pattern.
 * https://youtu.be/5bxF0MJ1oM0
 */
public class HouseRober2 {
    public static void main(String[] args) {
        int in[] = {1,2,500,102,1,9};
        HouseRober2 hr = new HouseRober2();
        hr.findMax(in);
    }

    private void findMax(int[] in) {
        int [] dp = new int [in.length];

        dp[0]=in[0];
        dp[1]=Integer.max(in[0],in[1]);
        for(int m=2;m<in.length-1;m++)
        {
            dp[m]=Integer.max(dp[m-2]+in[m],dp[m-1]);
        }

        int [] dp1 = new int [in.length];
        dp1[1]= in[1];
        dp1[2]=Integer.max(in[1],in[2]);
        for(int m=3;m<in.length;m++)
        {
            dp1[m]=Integer.max(dp1[m-2]+in[m],dp1[m-1]);
        }
        int max = Integer.max(dp[in.length-1],dp1[in.length-1]);
        System.out.println(max);
    }
}

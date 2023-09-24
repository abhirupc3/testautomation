package may2023.newexcercises;

/**
 * @author achatterjee ON 5/6/23
 * @project testautomation
 */

/**
 * https://youtu.be/YEEQRP2ZFxk
 * choose the non adjecent houses to robbmaximum amount.
 *
 */
public class HouseRobber {
    public static void main(String[] args) {
        int in[] = {1,2,500,102,1,9};
        HouseRobber hr = new HouseRobber();
        hr.findMax(in);
    }

    private void findMax(int[] in) {
        int[] dp = new int[in.length];
        dp[0]=in[0];
        dp[1]=Integer.max(in[0],in[1]);
        for(int m=2;m<in.length;m++)
        {
            dp[m]=Integer.max(dp[m-2]+in[m],dp[m-1]);
        }
        System.out.println(dp[in.length-1]);
    }
}

package may2023.newexcercises;

/**
 * @author achatterjee ON 5/5/23
 * @project testautomation
 */

/**
 * input racecar, abhirupracecarAbhirup output raceCar
 */
public class LongestCommonSubString {

    public static void main(String[] args) {
        LongestCommonSubString subseq = new LongestCommonSubString();
        String s1 = "racecar";
        String s2 = "AbhirupracecarChattehjghjrghjghjg";
        subseq.find(s1,s2);
    }
    private void find(String s1,String s2) {
        int [][] dp = new int[s1.length()+1][s2.length()+1];
        int max=0; int p=0,q=0;
        StringBuffer sb = new StringBuffer();
        int ind=0;
        for(int x = s1.length()-1; x >=0; x-- ) {
            for (int y = s2.length() - 1; y >= 0; y--) {
                   if(s1.charAt(x)==s2.charAt(y))
                   {
                       dp[x][y]=1+dp[x+1][y+1];
                       if(max<dp[x][y]) {
                           max = dp[x][y];
                           ind=x;
                       }
                       else{
                           dp[x][y]=Integer.max(dp[x][y+1],dp[x+1][y]);
                       }
                       //System.out.println(s1.charAt(x));

                   }

            }

        }
        System.out.println("The value is: "+max);
        System.out.println(ind);
        int c=1;
        while(c<=max)
        {
            System.out.print(s1.charAt(ind++));
            c++;
        }
    }

}

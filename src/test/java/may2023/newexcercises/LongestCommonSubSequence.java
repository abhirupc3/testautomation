package may2023.newexcercises;

/**
 * @author achatterjee ON 5/5/23
 * @project testautomation
 */
// https://youtu.be/Ua0GhsJSlWM


/**
 * input: ABCDE, ABEF
 * output: ABE
 */
public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String str1="ABCDE";
        String str2= "ABZD";
        LongestCommonSubSequence sub = new LongestCommonSubSequence();
        sub.find(str1,str2);
    }

    private void find(String str1, String str2) {
        String s1="",s2="";
        if(str1.length()>str2.length()) {
            s1 = str1;
            s2=str2;
        }
        else {
            s2=str1;
            s1=str2;
        }
        int max = 0;
        StringBuffer sb = new StringBuffer();
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int m=s1.length()-1;m>=0;m--)
        {
           for(int n=s2.length()-1;n>=0;n--)
           {
               if(s1.charAt(m)==s2.charAt(n))
               {
                   dp[m][n] = dp[m+1][n+1]+1;
                   if(max<dp[m][n])
                       max=dp[m][n];
                   sb.append(s1.charAt(m));
               } else{
                   dp[m][n] = Integer.max(dp[m][n+1],dp[m+1][n]);
               }
           }
        }
        System.out.println("The Max String: "+max);
        System.out.println("The String is: "+sb.reverse().toString());

    }
}

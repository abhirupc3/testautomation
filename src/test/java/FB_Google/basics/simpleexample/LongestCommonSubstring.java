package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/5/22
 * @project testautomation
 * https://youtu.be/BysNXJHzCEs
 */
public class LongestCommonSubstring {
    public static void main(String[] args) {
       /* String s1 ="racecarcpurihba";
        String s2="abhirupcracecar";*/
        String s1 = "CDEAbhirup";
        String s2 = "AZSdefAbhi";

        longestCommonSubstring(s1.toCharArray(),s2.toCharArray());
    }
    /**
     * Dynamic way of calculating lcs
     */
    public static int longestCommonSubstring(char str1[], char str2[]){
        int T[][] = new int[str1.length+1][str2.length+1];

        int max = 0;
        String n = "";
        int end = 0;
        for(int i=1; i <= str1.length; i++){
            for(int j=1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    T[i][j] = T[i-1][j-1] +1;
                    if(max < T[i][j]){
                        end=i;
                        max = T[i][j];
                    }
                }
            }
        }
        System.out.println(end);
        for (int y=end-max;y<end; y++)
        {
            System.out.print(str1[y]);
        }
        System.out.println("\n");
        return max;
    }
}

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
       // String s1 = "CDEAbhirup";
       // String s2 = "AZSdefAbhi";
        String s1 = "racecar";
        String s2 = "abhirupracecarAbhirupecar";

        longestCommonSubstring(s1.toCharArray(),s2.toCharArray());
    }
    /**
     * Dynamic way of calculating lcs
     */
    public static int longestCommonSubstring(char str1[], char str2[]){
        int T[][] = new int[str1.length+1][str2.length+1];

        int length = 0;
        String n = "";
        int endIndex = 0;
        for(int i=1; i <= str1.length; i++){
            for(int j=1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    T[i][j] = T[i-1][j-1] +1;
                    if(length < T[i][j]){
                        endIndex=i;
                        length = T[i][j];
                    }
                }
            }
        }
        System.out.println("End value is: "+endIndex+" and Max value is: "+length);
        for (int y=endIndex-length;y<endIndex; y++)
        {
            System.out.print(str1[y]);
        }
        System.out.println("\n");
        return length;
    }
}

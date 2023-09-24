package FB_Google.basics;

/**
 * @author achatterjee ON 6/14/22
 * @project testautomation
 */
class Solution {
    public static void main(String[] args) {
        String input = "I went to bb";
        System.out.println(LongestPalindrome(input));
    }
    static String LongestPalindrome(String sentence) {
        //String result = "";
        String str = sentence;
        int n = str.length();
        boolean table[][] = new boolean[n][n];
        int maxlength = 1;
        for(int i = 0; i < n; i++)
            table[i][i] = true;
        int start = 0;

        for(int k = 3; k <= n; ++k){
            for(int i = 0; i < n-k+1; ++i){
                int j = i + k - 1;
                if(table[i+1][j-1] && str.charAt(i) == str.charAt(j)){
                    table[i][j] = true;
                    if(k>maxlength){
                        start = i;
                        maxlength = k;
                    }
                }
            }
        }
        String result = str.substring(start, start+maxlength);
        return result;
    }
}

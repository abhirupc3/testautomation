package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/19/22
 * @project testautomation
 */
public class LongestCommon {
    public static void main(String[] args) {
       /* String s1 ="racecarcpurihba";
        String s2="abhirupcracecar";*/
        String s1 = "CDEAbhirup";
        String s2 = "AZSdefAbhi";

        longestCommonSubstring(s1.toCharArray(),s2.toCharArray());
    }

    private static void longestCommonSubstring(char[] ch1, char[] ch2) {

        int [][] ij = new int[ch1.length+1][ch2.length+1];
        int length=0; int end=0;
        for( int c1=1;c1<=ch1.length;c1++)
        {
            for(int c2=1;c2<ch2.length;c2++)
            {
                if(ch1[c1-1]==ch2[c2-1])
                {
                    ij[c1][c2] = ij[c1-1][c2-1]+1;
                }
                if(length< ij[c1][c2])
                {
                    length =  ij[c1][c2];
                    end = c2;
                }

            }
        }

        for(int k = end-length; k<=end;k++)
        {
            System.out.print(String.valueOf(ch2[k]));
        }
    }
}

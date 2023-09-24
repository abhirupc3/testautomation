package FB_Google.basics.Revision.April;

/**
 * @author achatterjee ON 4/23/22
 * @project testautomation
 */
public class LongestPalin {
    public static void main(String[] args) {
        String s1 = "abhirudaldamadampcracperacecar";
        longestPal(s1);
    }

    private static void longestPal(String s1) {

        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();

        int length=Integer.MIN_VALUE;
        int endIndex = Integer.MIN_VALUE;
        int[][] d = new int[s1.length()+1][s2.length()+1];
        for(int k=1;k<s1.length();k++)
        {
            for (int l=1;l<s2.length();l++)
            {
                if(s1.charAt(k-1)==s2.charAt(l-1))
                {
                    d[k][l]=d[k-1][l-1]+1;

                }
                if(length<d[k][l])
                {
                    length = d[k][l];
                    endIndex = l;
                }
            }
        }

        for(int k=endIndex-length;k<endIndex+1;k++)
        {
            System.out.print(s2.charAt(k));
        }
    }

}

package FB_Google.basics.simpleexample.deceober;

/**
 * @author achatterjee ON 12/2/22
 * @project testautomation
 */
public class LongestPalin {
    public static void main(String[] args) {
        String s1 = "abhirudaldamadampcracperacecar";
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();
        LongestPalin lp = new LongestPalin();
        lp.palin(s1.toCharArray(),s2.toCharArray());
    }

    private void palin(char[] s1, char[] s2) {
        int pos[][] = new int[s1.length+1][s2.length+1];
        int maxLength=0;
        int endInd=0;
        for(int i=1;i<=s1.length;i++)
        {
            for(int j=1;j<=s2.length;j++)
            {
                if(s1[i-1]==s2[j-1])
                {
                    pos[i][j]=pos[i-1][j-1]+1;
                    if(maxLength<pos[i][j])
                    {
                        maxLength=pos[i][j];
                        endInd=i;
                    }
                }

            }
        } for(int m=endInd-maxLength; m<endInd;m++)
        {
            System.out.print(s1[m]);
        }
    }
}

package FB_Google.basics.Revision.April;

/**
 * @author achatterjee ON 4/23/22
 * @project testautomation
 */
public class LongSubString {
    public static void main(String[] args) {
        String s1 = "abhirudaldamadampcracpecar";
        String s2 = "racepcarcpmadamadladurihba";
        findLong(s1,s2);
    }

    private static void findLong(String s1, String s2) {
        int[][] k = new int[s1.length()+1][s2.length()+1];

        int length=Integer.MIN_VALUE;
        int endIndex=Integer.MIN_VALUE;

        for(int m=1;m<s1.length();m++)
        {
            for(int n=1;n<s2.length();n++) {

                if(s1.charAt(m-1)==s2.charAt(n-1))
                {
                    k[m][n]=k[m-1][n-1]+1;

                }
                   if(k[m][n]>length)
                   {
                       length=k[m][n];
                       endIndex=n;
                   }
                }
            }

        for(int i=(endIndex-length); i<endIndex; i++)
        {
            System.out.print(s2.charAt(i));
        }
    }
}

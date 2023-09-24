package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 3/5/22
 * @project testautomation
 */
public class LongestCommon {
    public static void main(String[] args) {
        String s1 = "abhirudaldamadampcracpecar";
        String s2 = "racepcarcpmadamadladurihba";
        printLingestCommn(s1,s2);
    }

    private static void printLingestCommn(String s1, String s2) {
        int i[][]  =new int[s1.length()+1][s2.length()+1];
        int max=0;
        int endIndex=0;
        for(int m=1;m<=s1.length();m++)
        {
            for(int n=1; n<=s2.length(); n++)
            {
                if(s1.charAt(m-1)==s2.charAt(n-1))
                {
                    i[m][n]= i[m-1][n-1]+1;
                    if(max<i[m][n])
                    {
                        max=i[m][n];
                    }
                    endIndex = m;
                }
            }
        }
        for(int p=endIndex-max; p<endIndex;p++)
        {
            System.out.println(s1.charAt(p));
        }
    }
}

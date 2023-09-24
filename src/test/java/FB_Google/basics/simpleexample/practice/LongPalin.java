package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 3/5/22
 * @project testautomation
 */
public class LongPalin {
    public static void main(String[] args) {
        //String s1 = "abhirudaldamadampcracperacecar";
        String s1 = "abhirudaldamadampcracperacecar";
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();
        printCommon(s1.toCharArray(),s2.toCharArray());
    }

    private static void printCommon(char[] s1, char[] s2) {
        int i[][] = new int [s1.length+1][s2.length+1];

        int maxCount=0;
        int endIndex=0;

        for(int m=1;m<=s1.length;m++)
        {
            for(int n=1;n<=s2.length;n++)
            {
                if(s1[m-1]==s2[n-1])
                {
                    i[m][n]=i[m-1][n-1]+1;
                    if(maxCount<i[m][n]) {
                        maxCount = i[m][n];
                        endIndex = m;
                    }
                }
            }
        }
        for(int p=endIndex-maxCount;p<endIndex;p++)
        {
            System.out.print(s1[p]);
        }
    }
}

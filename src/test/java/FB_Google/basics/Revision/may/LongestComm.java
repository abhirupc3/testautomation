package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class LongestComm {
    public static void main(String[] args) {
        LongestComm lc = new LongestComm();
        String s1 = "abhirudaldamadampcracperacecar";
        //String s1 = "abhirudaldamadampcracpecar";
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();
        lc.longComm(s1,s2);
    }

    private void longComm(String s1, String s2) {
        int[][] t = new int[s1.length()+1][s2.length()+1];

       int  length=0;
        int ei=0;
        for(int k=1;k<s1.length();k++)
        {
            for(int l=1;l<s2.length();l++)
            {
                if(s1.charAt(k-1)==s2.charAt(l-1))
                {
                    t[k][l]=t[k-1][l-1]+1;
                }
                if(length<t[k][l])
                {
                    length = t[k][l];
                    ei=k;
                }
            }
        }
        for(int p=ei-length;p<=ei;p++)
        {
            System.out.println(s1.charAt(p));
        }
    }
}

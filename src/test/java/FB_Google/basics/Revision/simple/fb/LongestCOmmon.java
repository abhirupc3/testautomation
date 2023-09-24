package FB_Google.basics.Revision.simple.fb;

/**
 * @author achatterjee ON 3/12/22
 * @project testautomation
 */
public class LongestCOmmon {
    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "racecar";
        LongestCOmmon lcom= new LongestCOmmon();
        lcom.findCommon(s1,s2);
    }

    private void findCommon(String s1, String s2) {
        int res[][] = new int[s1.length()+1][s2.length()+1];
        int endIndex=0;
        int length = 0;
        for( int p=1;p<=s1.length();p++) {
            for (int q = 1; q <= s2.length(); q++) {

                if(s1.charAt(p-1)==s2.charAt(q-1))
                {
                    res[p][q] = res[p-1][q-1]+1;
                    if(length<res[p][q])
                    {
                        endIndex=p-1;
                        length = res[p][q];
                    }

                }
            }
        }
        int c=0;
        while(c<length)
        {
            System.out.print(s1.charAt(endIndex--));
            c++;
        }
    }
}

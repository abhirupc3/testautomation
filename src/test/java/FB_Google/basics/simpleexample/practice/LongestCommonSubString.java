package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 2/13/22
 * @project testautomation
 */
public class LongestCommonSubString {

    //i/p: "Abhirup","defAbhi" o/p Abhi
    public static void main(String[] args) {
        LongestCommonSubString lc = new LongestCommonSubString();
        String s1 = "CDEAbhirup";
        String s2 = "AZSdefAbhi";
        lc.printCommonSubStr(s1,s2);
    }

    private void printCommonSubStr(String s1, String s2) {
        int max=0;
        int [][] pos = new int[s1.length()][s1.length()];
        int endPoint=0;
        for(int p1=1;p1<=s1.length();p1++)
        {
            for(int p2=1;p2<s1.length();p2++)
        {
            char c1 = s1.charAt(p1-1);
            char c2 = s2.charAt(p2-1);
            if(c1==c2)
            {
                pos[p1][p2] = pos[p1-1][p2-1]+1;
                if(pos[p1][p2]>max)
                {
                    max=pos[p1][p2];
                    endPoint=p1;
                }
            }
        }

        }
        for(int p = endPoint-max; p<endPoint; p++)
        {
            System.out.print(s1.charAt(p));
        }
    }
}

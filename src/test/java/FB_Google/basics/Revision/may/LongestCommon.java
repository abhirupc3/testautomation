package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/19/22
 * @project testautomation
 */
public class LongestCommon {
    public static void main(String[] args) {
        String s1 = "abhirudaldamadampcracpecar";
        String s2 = "racepcarcpmadamadladurihba";
        LongestCommon longcom = new LongestCommon();
        longcom.com(s1,s2);
    }

    private void com(String s1, String s2) {
         int t[][] = new int[s1.length()+1][s2.length()+1];

         int length = Integer.MIN_VALUE;
         int ei=0;
         for(int k=1;k<s1.length();k++)
         {
             for(int l=1; l<s2.length();l++)
             {


                 if(s1.charAt(k-1)==s2.charAt(l-1))
                 {
                     t[k][l]=t[k-1][l-1]+1;
                     if(length<t[k][l])
                     {
                        length = t[k][l];
                        ei=l-1;
                     }
                 }
             }
         }

         for(int k = (ei-length)+1; k<=ei;k++)
         {
             System.out.print(s2.charAt(k));
         }
    }
}

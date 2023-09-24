package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/19/22
 * @project testautomation
 */
public class StrRev {
    public static void main(String[] args) {
        String s = "Abhirup Chatterjee";
        for(int k=0; k<s.length();k++)
        {
            System.out.print(s.charAt(s.length()-1-k));
        }
    }
}

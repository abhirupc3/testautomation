package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 2/5/22
 * @project testautomation
 */
public class LongestPalin {

    public static void main(String[] args) {
        String s1 = "abhirupracecarChatterjee";
        String s2 = rev(s1);
        System.out.println(s2);
    }

    private static String rev(String s1) {
        String rev="";
        for(int i = 0; i< s1.length();i++)
        {
          rev=s1.charAt(i)+rev;
        }
        return rev;
    }
}

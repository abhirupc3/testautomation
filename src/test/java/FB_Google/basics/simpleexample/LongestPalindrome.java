package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/5/22
 * @project testautomation
 * https://www.youtube.com/watch?v=WpYHNHofwjc&t=525s
 */
public class LongestPalindrome {


    public static void main(String[] args) {
        String s1 = "abhirudaldamadampcracpecar";
        reverse(s1);
        int s = LongestCommonSubstring.longestCommonSubstring(s1.toCharArray(),reverse(s1).toCharArray());
        System.out.println(s);
    }

  public static String reverse(String str)
  {
      String  nstr="";
      char ch;

      System.out.print("Original word: ");
      System.out.println(str); //Example word

      for (int i=0; i<str.length(); i++)
      {
          ch= str.charAt(i); //extracts each character
          nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
      return nstr;
  }
}

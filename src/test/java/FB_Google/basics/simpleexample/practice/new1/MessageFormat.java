package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/27/22
 * @project testautomation
 */
public class MessageFormat {
    public static void main(String[] args) {
        String s = "Hello {0}, How are {1}";
        String[] p = {"America","You"};
        String ss = java.text.MessageFormat.format(s,p);
        System.out.println(ss);
    }
}

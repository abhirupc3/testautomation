package FB_Google.basics.Revision.simple;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class StringRev {
    public static void main(String[] args) {
        String s = "Abhirup Chatterjee";
        StringRev rev = new StringRev();
        System.out.println("Before reverse: "+s);
        String revStr = rev.reverse(s);
        System.out.println("After reverse: "+revStr);
    }

    private String reverse(String s) {

        if(s.length()==1)
            return s;
        return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }
}

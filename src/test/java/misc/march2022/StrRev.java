package misc.march2022;

/**
 * @author achatterjee ON 3/9/22
 * @project testautomation
 */
public class StrRev {

    public static void main(String[] args) {
        String s = "Abhirup Chatterjee";
        String rev = rev(s);
        System.out.println("Before reverse: \n"+s );
        System.out.println("After reverse: \n"+rev);
    }

    private static String rev(String s) {

        if(s.length()==1)
            return s;
        return s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
    }
}

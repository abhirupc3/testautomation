package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/27/22
 * @project testautomation
 */
public class DupeRemover {
    public static void main(String[] args) {
        String s = "abhirup Chatterjee";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(sb.toString().indexOf(s.charAt(i))<0)
            {
                sb.append(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println("The value is: "+sb.toString());
    }
}

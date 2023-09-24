package FB_Google.basics.simpleexample.practice.new1;

import java.util.Stack;

/**
 * @author achatterjee ON 2/23/22
 * @project testautomation
 */
public class SimPath {
    public static void main(String[] args) {
        String path = "/../de";
        String simplePath = simplePath(path);
        System.out.println(simplePath);

    }

    private static String simplePath(String path) {

        String[] st = path.split("/");
        Stack<String> sSt = new Stack<>();
        StringBuilder sb = new StringBuilder();
       for(int y=0;y<st.length;y++)
       {
           if(!st[y].equalsIgnoreCase("..") && !st[y].equalsIgnoreCase("."))
           {
            sb.append(st[y]);
            if(y!=st.length-1)
                sb.append("/");
           }
       }
       return sb.toString();
    }
}

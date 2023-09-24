package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class SimplifiedPath {
    public static void main(String[] args) {
        String path = "cd/as/../de..";
        SimplifiedPath sp = new SimplifiedPath();
        sp.simplePath(path);
    }

    private void simplePath(String path) {
        String[] ele = path.split("/");
        Stack<String> st = new Stack<String>();

        for(int k=0;k<ele.length;k++)
        {
            if(!ele[k].equals("..") && !ele[k].equals("//") && !ele[k].equals("."))
            {
                st.push(ele[k]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s: st)
        {
            sb=sb.append("/").append(s);
        }
        if(sb.toString().length()==0)
            sb=sb.append("/");
        System.out.println(sb.toString());
    }
}

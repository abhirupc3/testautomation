package FB_Google.basics.simpleexample.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class SimpPath {
    public static void main(String[] args) {
        String path ="cd/as/../de//..";
        String[] s = path.split("/");
        List<String> l = new ArrayList<>();
        for(String ss: s)
        {
            if(!ss.equals("..") && !ss.isEmpty())
            l.add(ss);
        }
        StringBuilder sb = new StringBuilder();
        for(int k=0;k<l.size();k++)
        {
               sb.append(l.get(k));
               if (k != l.size() - 1)
                   sb.append("/");
        }
        System.out.println(sb.toString());
    }
}

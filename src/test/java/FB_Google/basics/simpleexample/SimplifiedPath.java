package FB_Google.basics.simpleexample;

import java.util.*;

/**
 * @author achatterjee ON 2/11/22
 * @project testautomation
 * Example 1:
 * <p>
 * Input: path = "/home//"
 * Output: "/home"
 * Explanation: Note that there is no trailing slash after the last directory name.
 * Example 2:
 * <p>
 * Input: path = "/../"
 * Output: "/"
 * Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
 * Example 3:
 * <p>
 * Input: path = "/home//foo/"
 * Output: "/home/foo"
 * Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
 */
public class SimplifiedPath {

    public static void main(String[] args) {
        String path = "cd/as/..//de..";
        String simplePath = simplePath(path);
        System.out.println("The output is: "+simplePath);

        }
        public static  String simplePath(String path)
        {
            String[] tokenizedPath = path.split("/");
            Stack<String> dirStack = new Stack <String> ();
            for(String dir:tokenizedPath)
            {
                System.out.println(dir);
                if(!dirStack.isEmpty() && dir.equals(".."))
                {
                    dirStack.pop();
                } else if(!Arrays.asList("",".","..").contains(dir))
                {
                    dirStack.push(dir);
                }
            }
            StringBuilder simplePath = new StringBuilder();

            for (String dir: dirStack)
            {
                simplePath.append("/").append(dir);
            }
            simplePath = simplePath.length()==0?simplePath.append("/"):simplePath;
            return simplePath.toString();
        }
}

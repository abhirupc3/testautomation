package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class LongSubString {
    public static void main(String[] args) {
        String s = "abcae";
        LongSubString ls = new LongSubString();
        ls.findLong(s);
    }

    private void findLong(String s) {

        int p=0;
        int q=0;
        int li=0;
        int si=0;
        int max=0;
        Map<Character,Integer> mp = new HashMap<Character,Integer>();
        while(q<s.length())
        {
            if(!mp.containsKey(s.charAt(q)))
            {
                mp.put(s.charAt(q),q);
                if(max<q-p) {
                    max = q-p;
                    si=p;
                    li=q;
                }
                q++;
            } else{
                p=mp.get(s.charAt(q))+1;
                mp.clear();
                mp.put(s.charAt(q),q+1);
                p++;
            }
        }
        System.out.println(si);
        System.out.println(li);
    }
}

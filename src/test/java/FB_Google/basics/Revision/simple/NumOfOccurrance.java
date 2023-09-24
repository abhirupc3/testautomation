package FB_Google.basics.Revision.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class NumOfOccurrance {
    public static void main(String[] args) {
        String s = "Hello Java World";
        NumOfOccurrance num = new NumOfOccurrance();
        num.checkOcc(s);
    }

    private void checkOcc(String s) {
        Map<String,Integer> mp = new HashMap<>();
        for(int t=0;t<s.length();t++)
        {
            String p = String.valueOf(s.charAt(t));
           if(mp.containsKey(p))
               mp.put(p,mp.get(p)+1);
           else
               mp.put(p,1);
        }
        for(Map.Entry<String,Integer> e: mp.entrySet())
        {
            System.out.println(e.getKey()+" Number of occurrance is: "+e.getValue());
        }
    }
}

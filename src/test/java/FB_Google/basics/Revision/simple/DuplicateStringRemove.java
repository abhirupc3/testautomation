package FB_Google.basics.Revision.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class DuplicateStringRemove {
    public static void main(String[] args) {
        DuplicateStringRemove dupRem = new DuplicateStringRemove();
        String s = "Hello java World";
        String es = dupRem.remove(s);
        System.out.println("The original String is: \n"+s);
        System.out.println("The output after removing of duplicates is: \n"+es);
    }

    private String remove(String s) {
        List<String> sList = new ArrayList<>();
        StringBuilder sBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!sList.contains(String.valueOf(s.charAt(i))))
                sBuilder.append(String.valueOf(s.charAt(i)));
            sList.add(String.valueOf(s.charAt(i)));
        }
        return sBuilder.toString();
    }
}

package newPreperation.march2022;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author achatterjee ON 2/25/22
 * @project testautomation
 */
public class Anagram {
    public static void main(String[] args) {
        String s1 = "race car";
        String s2 = "car racee";
        checkAna(s1,s2);
    }

    private static void checkAna(String s1, String s2) {
        s1 = s1.replaceAll("\\s","");
        s2 = s2.replaceAll("\\s","");
        if(s1==null || s2==null)
        {
            System.out.println("Not an anagram");
            return;
        }
        if(s1.length()!=s2.length())
        {
            System.out.println("Not an anagram");
            return;
        }
        List<String> li = new ArrayList<>();
        for(int i=0;i<s1.length();i++)
        {
           li.add(String.valueOf(s1.charAt(i)));

        }
        for(int k=0;k<s2.length();k++)
        {
            String key = String.valueOf(s2.charAt(k));
            if(li.contains(key))
            {
                li.remove(key);
            }
        }
        if(li.isEmpty())
        {
            System.out.println("This two numbers are Anagram");
        } else{
            System.out.println("This two numbers are not Anagram");
        }

    }
}

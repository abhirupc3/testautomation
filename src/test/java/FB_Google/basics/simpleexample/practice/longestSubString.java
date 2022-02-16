package FB_Google.basics.simpleexample.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 2/5/22
 * @project testautomation
 */
public class longestSubString {

    public static void main(String[] args) {
        String input = "abcabcbb";
        longestSubStr(input);
    }

    private static void  longestSubStr(String input) {

        int frontPtr=0;
        int backPtr=0;
        int length = 0;
        int s=0;
                int e=0;
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        while(frontPtr<input.length())
        {
            if(charMap.containsKey(input.charAt(frontPtr)))
            {
                backPtr = Math.max(backPtr,charMap.get(input.charAt(frontPtr))+1);
            }
            charMap.put(input.charAt(frontPtr),frontPtr);
            if(length<(frontPtr-backPtr+1))
            {
                length=frontPtr-backPtr+1;
                s=backPtr;
                e=frontPtr;
            }
            frontPtr=frontPtr+1;
        }
        for(int m = s;m<=e;m++)
        {
            System.out.println(input.charAt(m));
        }
    }
}

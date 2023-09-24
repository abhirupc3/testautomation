package FB_Google.basics.simpleexample.practice.new1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 2/19/22
 * @project testautomation
 */
public class UniqueSubStr {
    static String input = "abcbab";
    public static void main(String[] args) {
        printLongestUniqueSubstring(input);

    }

    private static void printLongestUniqueSubstring(String input) {
        int back=0; int maxLength=0; int stIndex=0;
        Map<Character,Integer> mp = new HashMap<>();

        for(int front=0;front<input.length();front++)
        {
            char c = input.charAt(front);
            if(mp.containsKey(c))
            {
                back = Math.max(mp.get(c)+1,back);
            }
            mp.put(c,front);
            if(maxLength<front-back+1) {
                maxLength = front - back + 1;
                stIndex=back;
            }
        }

        for( int m=stIndex;m<stIndex+maxLength;m++)
        {
            System.out.print(String.valueOf(input.charAt(m)));
        }
    }
}

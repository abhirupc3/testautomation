package FB_Google.basics.simpleexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author achatterjee ON 2/4/22
 * @project testautomation
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubString {

    //static String input = "pwwkew";
   // static String input = "abcdkc";
    static String input = "abcdaefgc";
    //static String[] input = {"a","b","c","a","b","c","a","b"};

    public static void main(String[] args) {
        printLongestUniqueSubstring(input);

    }


     public static void printLongestUniqueSubstring(String name)
     {
         int frontPointer = 0;
         int backPointer=0;
         int length=0;
         int st=0;
         int nd=0;
         Map<Character,Integer> charMap = new HashMap<Character,Integer>();
         while(frontPointer<name.length())
         {
             //Checking if there is already entry (duplicate) for the char, Then make the backpointer proceed until the duplicate
             if(charMap.containsKey(name.charAt(frontPointer)))
             {
                 backPointer = Math.max(charMap.get(name.charAt(frontPointer))+1,backPointer);
             }
             charMap.put(name.charAt(frontPointer),frontPointer);
             //length = Math.max(length,frontPointer-backPointer+1);
             if(length<(frontPointer-backPointer+1)) {
                 length = frontPointer - backPointer+1;
                 st=backPointer;nd=frontPointer;
             }
             frontPointer=frontPointer+1;

         }
         //length = frontPointer-backPointer;
         System.out.println("The value of length is: "+length);
         System.out.println("The subString of "+name+" Is: ");
         System.out.println("st "+st);
         System.out.println("nd "+nd);
         for(int m=st;m<=nd;m++)
         {
             if(m<name.length())
             System.out.print(name.charAt(m));
         }
     }
}

package may2023.newexcercises;


import java.util.*;

/**
 * @author achatterjee ON 5/8/23
 * @project testautomation
 * Completed 1st revision:
 * 1. BitCounter
 * 2. CharComparison
 * 3. CountBits
 * 4. DuplicateCheck
 * 5. HouseRobber
 * 6. Longest Subsequence
 * 7. Longest Common SubString
 * <p>
 * Old ecercise
 * 1. Add Strings
 * 2. Basic Calc
 */
public class Revision {
    public static void main(String[] args) {
        String path = "cd/as/..//de..";
        Revision rv = new Revision();
        rv.compute(path);
    }

    private void compute(String s) {
      StringTokenizer st = new StringTokenizer(s,"/");
      StringBuilder sb = new StringBuilder();
        System.out.println(st.countTokens());
        int token =  st.countTokens();
        int c=1;
    while(st.hasMoreTokens())
            {
                String s1 = st.nextToken();
                System.out.println(s1);
                if(s1.equals(".."))
                    continue;
                    sb.append(s1).append("/");

            }

    String s2 = sb.toString();
        System.out.println(s2);
        System.out.println(s2.substring(0,s2.length()-1));
    }
     public int findKtop(Map<Integer,Integer> mp, int key)
     {
         int max = Integer.MIN_VALUE;
         int k=0;
         for(Map.Entry<Integer, Integer> e: mp.entrySet())
         {
             if(e.getValue()>max)
             {
                 max=e.getValue();
                 k = e.getKey();
             }
         }
         System.out.println(k+","+max);
         if(key==1)
         {
             return 0;
         }
         mp.remove(k);
         return findKtop(mp,key-1);
     }

}

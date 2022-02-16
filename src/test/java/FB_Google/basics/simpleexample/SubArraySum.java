package FB_Google.basics.simpleexample;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 2/8/22
 * @project testautomation
 * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
 * Example 1:
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * Example 2:
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 */
public class SubArraySum {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        int target =9;
        printSubarrayAndLength(num,target);
    }

    private static void printSubarrayAndLength(int[] num, int target) {
        int sum=0;
        HashMap<Integer,Integer> digiMap = new HashMap<>();
        HashMap<Integer,Integer> subArrayIndex = new HashMap<>();
        digiMap.put(0,0);
        for(int m=0;m<num.length;m++)
        {
            sum=sum+num[m];
            int dif = sum-target;
            if(digiMap.containsKey(dif))
            {
                subArrayIndex.put(digiMap.get(dif),m);
            }
            digiMap.put(sum,m+1);
        }

        for(Map.Entry<Integer,Integer> e : subArrayIndex.entrySet())
        {
            int diff = 0;
            for(int m = e.getKey();m<=e.getValue();m++)
            {
                diff++;
                System.out.print(num[m]+",");

            }
            System.out.println("\nThe length is: "+diff);
            System.out.println("\n");
        }
    }
}

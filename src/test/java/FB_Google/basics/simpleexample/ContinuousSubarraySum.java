package FB_Google.basics.simpleexample;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 2/15/22
 * @project testautomation
 * https://leetcode.com/problems/continuous-subarray-sum/
 * Example 1:
 *
 * Input: nums = [23,2,4,6,7], k = 6
 * Output: true
 * Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
 * Example 2:
 *
 * Input: nums = [23,2,6,4,7], k = 6
 * Output: true
 * Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
 * 42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
 *
 * https://www.youtube.com/watch?v=G_N0H7tFLTY
 */
public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        String s = "asas";

        int k = 4;
        ContinuousSubarraySum cs = new ContinuousSubarraySum();
        boolean flag = cs.checkSubarraySum(nums,k);
        System.out.println(flag);
    }
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum=0;
        if(nums.length==1 && nums[0]==0)
            return false;

        for(int m=0; m<nums.length;m++)
        {
            sum = nums[m];
            for(int n=m+1;n<nums.length;n++)
            {
                sum=sum+nums[n];
                if(sum%k==0)
                    return true;
            }sum=0;
        }
         return false;
    }
    public boolean checkSubarraySum1(int[] nums, int k) {
       Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        map.put(0,-1);
        int sum=0;
        for(int i=0; i<nums.length;i++)
        {
            sum = sum+ nums[i];
            if(k!=0)
            {
                sum=sum%k;
            }
            if(map.containsKey(sum))
            {
                if(i-map.get(sum) >1)
                    return true;
                else
                    map.put(sum,i);
            }
        } return false;
    }

}

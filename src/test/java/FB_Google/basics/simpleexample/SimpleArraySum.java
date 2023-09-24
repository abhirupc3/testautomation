package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/3/22
 * @project testautomation
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class SimpleArraySum {
    static int[] nums = {2,7,11,15};
    public static void main(String[] args) {
        findLocation(nums,17);
    }
    public static void findLocation(int[] num, int target)
    {
        int currVal = num[0];
        int firstIndex = 0;
        int nextIndex = 0;
        for(int r = 1; r<nums.length; r++)
        {
            nextIndex = findextVal(num,r,target-nums[firstIndex]);
            if(nextIndex!=-1)
                break;
            firstIndex = r;
        }
        System.out.println("The output is: ["+firstIndex+","+nextIndex+"]");
    }

    public static int findextVal(int[] num,int stIndex, int nextNum)
    {
        for(int r = stIndex; r<nums.length; r++)
        {
            if(nextNum==nums[r])
            {
                return r;
            }
        } return -1;
    }
}

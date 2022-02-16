package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/15/22
 * @project testautomation
 * https://leetcode.com/problems/find-peak-element/
 */
public class FindPeekElement {

    public static void main(String[] args) {
        FindPeekElement fpe = new FindPeekElement();
        int i[] = {1,2,3,1};
        int res = fpe.findPeakElement(i);
        System.out.println("Peak index is: "+res);
    }
    public int findPeakElement(int[] nums) {
        int prev=0;
        int mid= 1;
        int next =2;
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return   0;

        if(nums.length==2)
        {
            if(nums[0]>nums[1])
                return 0;
            else
                return 1;
        }

        if(nums[mid]>nums[prev] && nums[mid]>nums[next])
            return mid;
        if(nums[prev]>nums[mid])
            return prev;
        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        while(true)
        {
            prev=prev+1;
            mid=mid+1;
            next=next+1;
            if(next>=nums.length)
                return  Math.max(nums[prev],nums[mid]);
            if(nums[mid]>nums[prev] && nums[mid]>nums[next])
            {
                return mid;
            }

        }
    }
}

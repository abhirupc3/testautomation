package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 2/15/22
 * @project testautomation
 * https://leetcode.com/problems/find-peak-element/
 */
public class FindPeekElement {

    public static void main(String[] args) {
        FindPeekElement fpe = new FindPeekElement();
        int i[] = {7,2,9,2};
        int res1 = fpe.findPeakElement(i);
        int res = fpe.findPeak(i);
        System.out.println("Peak index is: "+i[res]);
        System.out.println("Peak index is: "+i[res1]);
    }
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }
    //Using Binary Search

    public int findPeak(int[] nums)
    {
        int l=0;
        int ri = nums.length-1;

        while(l<=ri)
        {
            int m = (l+ri)/2;
            if(m!=nums.length-1 && nums[m]<nums[m+1])
            {
                l=m+1;
            } else if(m!=0 && nums[m]<nums[m-1])
            {
                ri=m-1;
            } else{
                return m;
            }
        } return -1;
    }
}

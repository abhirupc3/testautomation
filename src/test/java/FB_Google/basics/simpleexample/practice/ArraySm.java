package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class ArraySm {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target =18;
        int ind1=-1;
        int ind2=-1;
        for(int i=0;i<nums.length;i++)
        {
            for(int k = 1;k<nums.length;k++)
            {
                if(nums[i]+nums[k]==target)
                {
                    ind1=i;
                    ind2=k;
                    break;
                }
            }
        }
        System.out.println(ind1+" "+ind2);
    }
}

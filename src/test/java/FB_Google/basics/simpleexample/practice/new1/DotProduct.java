package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/23/22
 * @project testautomation
 */
public class DotProduct {
    public static void main(String[] args) {
        int[] nums1 = {1,0,0,2,3}, nums2 = {0,3,0,4,0};
        calculate(nums1,nums2);
    }
    public static void calculate(int[] num1, int[] num2)
    {
        int sum = 0;
        for(int i=0;i<num1.length;i++)
        {
            sum = sum+ num1[i]*num2[i];
        }
        System.out.println(sum);
    }
}

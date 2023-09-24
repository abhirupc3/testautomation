package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/23/22
 * @project testautomation
 */
public class SimpleArraySum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target =13;
        int ind1=-1;
        int ind2=-1;
        for(int m=0;m<nums.length;m++)
        {
            int n=nums[m];
            int k=m+1;
            int nextNum = target-n;
            while(k<nums.length)
            {
                if(nums[k]==nextNum)
                {
                   ind1=m;
                   ind2=k;
                }
                k++;
            }

        }
        System.out.println("The value of index are: "+ind1+"and"+ind2);
    }
}

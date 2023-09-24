package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class COntSub {
    public static void main(String[] args) {
        int[] nums = {23, 2, 6, 4, 7};
        int key =6;
        COntSub cos = new COntSub();
        cos.find(nums,key);
    }

    private void find(int[] nums, int key) {
       int sum=0;
       Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
       mp.put(0,0);


       for(int k=0;k<nums.length;k++)
       {
           sum=sum+nums[k];
           int mod= sum%key;
           if(mp.containsKey(mod))
           {
               System.out.println(mp.get(mod)+" to   "+k);
           } else{
               mp.put(sum,k+1);
           }
       }
    }
}

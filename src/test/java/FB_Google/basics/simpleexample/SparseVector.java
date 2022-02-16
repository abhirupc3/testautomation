package FB_Google.basics.simpleexample;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 2/7/22
 * @project testautomation
 */
public class  SparseVector {
    int[] nums;

    SparseVector(int[] nums) {
        this.nums=nums;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,0,0,2,3}, nums2 = {0,3,0,4,0};
        SparseVector sv1 = new SparseVector(nums1);
        SparseVector sv2 = new SparseVector(nums2);
        int sum = sv1.dotProduct(sv2);
        System.out.println(sum);
    }
    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {

        Map<Integer,Integer> mp1 = new HashMap<Integer,Integer>();
        Map<Integer,Integer> mp2 = new HashMap<Integer,Integer>();
        int sum=0;
        for(int m =0;m<nums.length;m++)
        {
            if(nums[m]!=0)
                mp1.put(m,nums[m]);
        }
        for(int m =0;m<vec.nums.length;m++)
        {
            if(vec.nums[m]!=0)
                mp2.put(m,vec.nums[m]);
        }

        for(Map.Entry<Integer,Integer> e: mp1.entrySet())
        {
            if(mp2.containsKey(e.getKey()))
            {
                sum=sum+e.getValue()*mp2.get(e.getKey());
            }
        } return sum;
    }
}
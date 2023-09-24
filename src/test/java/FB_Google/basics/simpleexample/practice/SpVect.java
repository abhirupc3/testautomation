package FB_Google.basics.simpleexample.practice;

import FB_Google.basics.simpleexample.SparseVector;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class SpVect {
    public static void main(String[] args) {
        int[] nums1 = {1,0,0,2,3}, nums2 = {0,3,0,4,4};
        int sum = dotProduct(nums1,nums2);
        System.out.println(sum);
    }

    private static int dotProduct(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp1 = new HashMap<Integer,Integer>();
        Map<Integer,Integer> mp2 = new HashMap<Integer,Integer>();
        for(int i1=0;i1<nums1.length;i1++)
        {
            if(nums1[i1]!=0)
            {
                mp1.put(i1,nums1[i1]);
            }
        }
        for(int i2=0;i2<nums2.length;i2++)
        {
            if(nums2[i2]!=0)
            {
                mp2.put(i2,nums2[i2]);
            }
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> e: mp1.entrySet())
        {
            if(mp2.containsKey(e.getKey()))
                sum=sum+e.getValue()*mp2.get(e.getKey());
        }
        return sum;
    }
}

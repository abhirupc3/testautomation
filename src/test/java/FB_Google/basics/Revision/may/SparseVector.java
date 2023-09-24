package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class SparseVector {
    public static void main(String[] args) {
        int[] nums1 = {1,0,0,2,3}, nums2 = {0,3,0,4,4};
        SparseVector sv = new SparseVector();
        sv.spase(nums1,nums2);
    }
    public void spase(int[] nums1, int[] nums2)
    {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        Map<Integer,Integer> mp2 = new HashMap<Integer,Integer>();
        if(nums1.length!=nums2.length)
        {
            System.out.println("arrayLength not matched!!!");
            return;
        }
        for(int k=0;k<nums1.length;k++)
        {
            if(nums1[k]!=0)
              mp.put(k,nums1[k]) ;
            if(nums2[k]!=0)
                mp2.put(k,nums2[k]) ;
        }
        int res=0;
        for(Map.Entry<Integer,Integer> entry: mp.entrySet())
        {
            if(mp2.containsKey(entry.getKey()))
            {
                res=res+ entry.getValue()*mp2.get(entry.getKey());
            }
        }
        System.out.println("The value of Vector Multiplication is: "+res);
    }
}

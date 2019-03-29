package trash;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> newNums = new ArrayList<Integer>();
       for(int i=0;i<nums.length;i++)
       {
           int c=0;
           for(int k=i+1;k<nums.length;k++)
           {
              if(nums[i]>nums[k])
              {
                  c++;
              }
           }
           newNums.add(c);
       }
        return newNums;
        
    }
    public static void main(String[] args) {
		int i[]= {5,2,6,1};
		System.out.println(countSmaller(i));
	}
}
package FB_Google.basics.simpleexample;

import java.util.Arrays;

/**
 * @author achatterjee ON 2/14/22
 * @project testautomation
 * //https://www.youtube.com/watch?v=ho4gTCr0QSk
 * //https://leetcode.com/problems/next-permutation/submissions/
 */
public class NextPermutationNumber {

    public static void main(String[] args) {
        NextPermutationNumber np = new NextPermutationNumber();
        int[] n = {1,3, 2};
        int[] res = np.nextPermutation(n);
        for(int i: res)
        {
            System.out.println(i);
        }
    }

    public int[] nextPermutation(int[] nums) {

        int len = nums.length;
        int pos = -1;
        for (int c = len - 1; c >= 0; c--) {
            if (c - 1 >= 0 && nums[c - 1] < nums[c]) {
                pos = c - 1;
                break;
            }
        }
        if(pos==-1) {
             Arrays.sort(nums);
            return nums;
        }
        return nextPos(pos,nums);
    }

    public int[] nextPos(int pos, int[] nums) {
        int nextVal = Integer.MAX_VALUE;
        int val = nums[pos];
        int po = -1;
        for (int p = pos + 1; p < nums.length; p++) {
            int temp = nums[p] - val;
            if (temp < nextVal) {
                nextVal = temp;
                po = p;
            }
        }

        int t = nums[pos];
        nums[pos] = nums[po];
        nums[po] = t;

        int[] temAr = new int[nums.length - (pos + 1)];
        int c=0;
        for(int i = (pos+1);i<nums.length;i++)
        {
            temAr [c++]=nums[i];
        }


        Arrays.sort(temAr);
        int result[] = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            if (k <= pos)
                result[k] = nums[k];
            else
                result[k] = temAr[k - (pos + 1)];
        }
        return result;
    }
}

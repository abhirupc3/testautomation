package FB_Google.basics.simpleexample;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author achatterjee ON 2/14/22
 * @project testautomation
 * //https://www.youtube.com/watch?v=ho4gTCr0QSk
 * //https://leetcode.com/problems/next-permutation/submissions/
 */
public class NextPermutationNumber {

    public static void main(String[] args) {
        NextPermutationNumber np = new NextPermutationNumber();
        //int[] n = {7,2, 5,3,4};
        int[] n = {7,2,5,3,1};
        int[] res = np.nextPermutation(n);
        for(int i: res)
        {
            System.out.print(i);
        }
    }

    public int[] nextPermutation(int[] n) {

        int index = -1;
        for (int c = n.length - 1; c >= 0; c--) {
            if (c - 1 >= 0 && n[c] > n[c - 1]) {
                index = c - 1;
                break;
            }
        }
        if(index==-1)
        {
            Arrays.sort(n);
            return n;
        }
        int diff = Integer.MAX_VALUE;
        int endIndex = -1;
        for (int p = index + 1; p < n.length; p++) {
            if (n[index] < n[p] && diff >= n[p] - n[index]) {
                diff = n[p] - n[index];
                endIndex = p;
                //break;
            }
        }
        int temp1 = n[index];
        n[index]=n[endIndex];
        n[endIndex] = temp1;

        int[] temp = new int[n.length-index-1];
        int c = 0;
        for (int p = index + 1; p < n.length; p++) {
            temp[c++]=n[p];
        }
        Arrays.sort(temp);
        c=0;
        for (int p = index + 1; p < n.length; p++) {
            n[p]=temp[c++];
        }
        return  n;
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

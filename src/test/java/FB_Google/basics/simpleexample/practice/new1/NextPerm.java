package FB_Google.basics.simpleexample.practice.new1;

import FB_Google.basics.simpleexample.NextPermutationNumber;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author achatterjee ON 2/22/22
 * @project testautomation
 */
public class NextPerm {
    public static void main(String[] args) {
        NextPerm np = new NextPerm();
        //int[] n = {1,3, 2};
        int[] n = {3,2,1};
        //int[] n = {7, 2, 5, 3, 1};
        int[] res = np.nextPermutation(n);
        for (int i : res) {
            System.out.print(i);
        }
    }

    private int[] nextPermutation(int[] n) {
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
}

package FB_Google.basics.simpleexample.practice;

import java.util.Arrays;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class Perm {
    public static void main(String[] args) {
        Perm perm = new Perm();
        int[] n = {7,2, 5,3,1};
        int[] res = perm.nextPermutation(n);
        for(int l: res)
        {
            System.out.print(l+ "  ");
        }
    }

    private int[] nextPermutation(int[] n) {
        int index =-1;

        for(int m=n.length-1; m>=0; m--)
        {
            if(n[m-1]<n[m])
            {
                index=m-1;
                break;
            }
        }
        if(index==-1)
        {
            Arrays.sort(n);
            return n;
        }
        int diff=Integer.MAX_VALUE;
        int nextIndex=0;
        for( int p=index+1;p<n.length;p++)
        {
            if(n[index]<n[p] && diff>=n[p]-n[index])
            {
                nextIndex=p;
                diff = n[p]-n[index];
            }
        }
        int temp = n[index];
        n[index]=n[nextIndex];
        n[nextIndex]=temp;
        int te[] = new int[n.length-index-1];
        int c=0;
        for(int s=index+1;s<n.length;s++)
        {
            te[c++] = n[s];
        }
        Arrays.sort(te);
        c=0;
        for(int s=index+1;s<n.length;s++)
        {
            n[s] =te[c++];
        }
        return n;
    }
}

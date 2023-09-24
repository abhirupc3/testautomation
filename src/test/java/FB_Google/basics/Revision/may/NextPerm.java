package FB_Google.basics.Revision.may;

import java.util.*;

/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class NextPerm {
    public static void main(String[] args) {
        int[] n = {7,2, 5,3,1};
        NextPerm np = new NextPerm();
        System.out.println("FirstNumber \n");
        for(int k =0; k<n.length;k++)
        {
            System.out.print(n[k]);
        }
        np.nextP(n);
    }

    private void nextP(int[] n) {

        int ind=-1;

        for(int k=n.length-1;k>=0;k--)
        {
            if(n[k-1]<n[k])
            {
                ind=k-1;
                break;
            }
        }
        if(ind==-1)
        {
            Arrays.sort(n);
            System.out.println(String.valueOf(n));
            return;
        }
        int diff = Integer.MAX_VALUE;
        int p=-1;
        for(int k=ind+1;k<n.length;k++)
        {
            if(n[k]>n[ind] && (n[k]-n[ind])<diff)
            {
                diff=n[k]-n[ind];
                p=k;
            }
        }
        int l = n[ind];
        n[ind]=n[p];
        n[p]=l;
        List<Integer> li = new ArrayList<Integer>();
        for(int k=ind+1;k<n.length;k++)
        {
            li.add(n[k]);
        }
        Collections.sort(li);
        for(int k=ind+1;k<n.length;k++)
        {
            n[k]=li.get(0);
            li.remove(0);
        }
        System.out.println("\n Next permutation is \n");
        for(int k =0; k<n.length;k++)
        {
            System.out.print(n[k]);
        }
    }

}

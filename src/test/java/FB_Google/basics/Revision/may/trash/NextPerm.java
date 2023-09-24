package FB_Google.basics.Revision.may.trash;

import java.util.*;

/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class NextPerm {

    public static void main(String[] args) {
        int[] n = {7,2, 5,3,1};
        NextPerm np = new NextPerm();
        int[] p = np.perm(n);
        for(int k: p)
            System.out.print(k);
    }

    private int[] perm(int[] n) {

        int ind=Integer.MIN_VALUE;

        for(int k=n.length-1; k>0;k--)
        {
            if(n[k-1]<n[k])
            {
                ind=k-1;
                break;
            }
        }
        if(ind==Integer.MIN_VALUE)
        {
            Arrays.sort(n);
            return n;
        }
        int dif = Integer.MAX_VALUE;
        int p= Integer.MIN_VALUE;
      for(int k=ind+1;k<n.length-1;k++)
      {
          if(n[ind]<n[k+1])
          {
              int d = n[k+1]-n[ind];
              if(d<dif) {
                  p = k + 1;
                  dif=d;
              }
          }
      }
      int t = n[ind];
      n[ind]=n[p];
      n[p]=t;
      ArrayList<Integer> li = new ArrayList<Integer>();
      for(int k = ind+1;k<n.length;k++)
      {
          li.add(n[k]);
      }
      Collections.sort(li);
      for(int k=ind+1;k<n.length;k++)
      {
          n[k]=li.get(0);
          li.remove(0);
      }
   return n;
    }
}

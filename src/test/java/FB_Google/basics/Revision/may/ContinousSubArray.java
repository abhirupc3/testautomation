package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class ContinousSubArray {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5};
        int key=9;
        ContinousSubArray cs = new ContinousSubArray();
        cs.find(i,key);
    }

    private void find(int[] i, int key) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        mp.put(0,0);
        int sum=0;
        for(int k=0;k<i.length;k++)
        {
            sum=sum+i[k];
            int def = sum-key;
            if(mp.containsKey(def))
            {
                System.out.println(mp.get(def)+" to "+k);
            } else{
                mp.put(sum,k+1);
            }
        }
    }
}

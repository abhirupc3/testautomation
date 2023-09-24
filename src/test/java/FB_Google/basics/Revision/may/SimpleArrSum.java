package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class SimpleArrSum {
    public static void main(String[] args) {
       int [] in =  {2,7,11,15};
        SimpleArrSum s = new SimpleArrSum();
        s.arrySum(in,9);
    }

    private void arrySum(int[] in, int target) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int sum=0;
        mp.put(0,0);
        for(int k=0;k<in.length;k++)
        {
            sum=sum+in[k];
            int def = sum-target;
            if(mp.containsKey(def))
            {
                System.out.println(mp.get(def)+"    "+k);
            } else{
                mp.put(def,k+1);
            }
        }
    }


}

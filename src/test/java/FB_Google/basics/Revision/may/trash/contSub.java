package FB_Google.basics.Revision.may.trash;
import java.util.*;
/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class contSub {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5};
        contSub cs = new contSub();
        cs.sub(i,9);
    }

    private void sub(int[] i,int key) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        mp.put(0,-1);
        int sum = 0;

        for(int k=0;k<i.length;k++)
        {
            sum=sum+i[k];
            int dif = sum-key;
            if(mp.containsKey(dif))
            {
                int temp = mp.get(dif)+1;
                System.out.println(temp+"  "+k);
            } else{
                mp.put(sum,k);
            }
        }
    }
}

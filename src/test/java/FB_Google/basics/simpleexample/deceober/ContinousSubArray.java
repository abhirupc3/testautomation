package FB_Google.basics.simpleexample.deceober;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 12/2/22
 * @project testautomation
 */
public class ContinousSubArray {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,8};
        ContinousSubArray csa = new ContinousSubArray();
        csa.find(i,9);
    }

    private void find(int[] i, int n) {
        Map<Integer,Integer> modMap = new HashMap<Integer,Integer>();
        Map<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        int sum=0;
        int mod=0;
        modMap.put(0,-1);
        for(int k=0;k<i.length;k++)
        {
            sum=sum+i[k];
            mod = sum%n;
            if(modMap.containsKey(mod))
            {
                indexMap.put(modMap.get(mod)+1,k);
            }
            modMap.put(mod,k);
        }
        for(Map.Entry<Integer,Integer> e: indexMap.entrySet())
        {
            System.out.println("Start Index: "+e.getKey()+"  End index: "+e.getValue());
            System.out.println("\n");
        }
    }
}

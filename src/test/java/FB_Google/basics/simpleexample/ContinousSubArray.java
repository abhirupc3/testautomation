package FB_Google.basics.simpleexample;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 3/5/22
 * @project testautomation
 * This program shoud perform 2 operation.
 * for a given array i={5,4,3,2,1,4} and a key =7;
 * it has to find howmany sub array sum is equal to key or divisible by key
 * Another operation should be if the array has any sub array which is divisible by key or equal to key
 * https://www.youtube.com/watch?v=QM0klnvTQzk
 */
public class ContinousSubArray {


    public static void main(String[] args) {
        //int[] i = {1,2,3,4,5};
        //int[] i = {1,2,9,7,8};
        int[] i = {23,2,4,6,7};
        int key=6;
        checkSum(i,key);
        coundSubArray(i,key);

    }

    private static void checkSum(int[] i,int key) {
        int sum=0;
        int mod=0;
        Map<Integer,Integer> modMap = new HashMap<>();
        for(int m=0;m<i.length;m++)
        {
            sum = sum+i[m];
            mod = sum%key;
            if(modMap.containsKey(mod)&&m-modMap.get(mod)>1)
            {
                System.out.println("There is a sub String whose sum is equal or multiple of "+key);
                break;
            } else{
                modMap.put(mod,m);
            }
        }
    }

    private static void coundSubArray(int[] i,int key) {
        int sum=0;
        int mod =0;
        Map<Integer,Integer> modMap = new HashMap<>();
        Map<Integer,Integer> indexMap = new HashMap<>();
        modMap.put(0,-1);
        for(int m=0;m<i.length;m++)
        {
            sum=sum+i[m];
            mod=sum%key;
            if(modMap.containsKey(mod) && m-modMap.get(mod)>1)
            {
                indexMap.put(modMap.get(mod)+1,m);
                modMap.put(mod,m);
            } else{
                modMap.put(mod,m);
            }
        }
        for(Map.Entry<Integer,Integer> e: indexMap.entrySet())
        {
            for(int k=e.getKey();k<=e.getValue();k++)
            {
                System.out.print(i[k]+ " ");
            }
            System.out.println("\n");
        }
    }
}

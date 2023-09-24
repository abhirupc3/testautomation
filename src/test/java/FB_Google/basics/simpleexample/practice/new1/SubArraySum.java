package FB_Google.basics.simpleexample.practice.new1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 2/24/22
 * @project testautomation
 */
public class SubArraySum {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        int target =9;
        printSubarrayAndLength(num,target);
    }

    private static void printSubarrayAndLength(int[] num, int target) {


        int dif = 0;
        int sum=0;
        Map<Integer,Integer> subInd = new HashMap<>();
        Map<Integer,Integer> indMap= new HashMap<>();
        for(int m=0;m<num.length;m++)
        {
            sum = sum+num[m];
            dif = sum-target;
            if(indMap.containsKey(dif))
            {
                subInd.put(indMap.get(dif)+1,m);
            }
            indMap.put(sum,m);

        }
        System.out.println(subInd);
    }

}

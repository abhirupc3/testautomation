package FB_Google.basics.simpleexample.practice.new1;

import java.util.HashMap;

/**
 * @author achatterjee ON 2/18/22
 * @project testautomation
 */
public class ContinousSubArraySum {

    public static void main(String[] args) {
        int[] nums = {1,3,1,0,1};
        ContinousSubArraySum cs = new ContinousSubArraySum();
        System.out.println(cs.subArray(nums,4));
    }

    public boolean subArray(int[] num, int key) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        int sum=0;
        int mod=0;
        if(key==0)
        {
            return true;
        }
        if(num.length<2)
            return false;
        for(int m = 0; m < num.length; m++)
        {
            sum = sum + num[m];
            mod = sum%key;
            if(mp.containsKey(mod) && m-mp.get(mod)>1)
                return true;
            mp.put(mod,m);
            mod=0;
        }

        return false;
    }
}

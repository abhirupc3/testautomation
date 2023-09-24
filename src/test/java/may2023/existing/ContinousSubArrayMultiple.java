package may2023.existing;
import java.util.*;
/**
 * @author achatterjee ON 5/9/23
 * @project testautomation
 */

/**
 * i={5,4,3,2,1,4} and a key =7;
 * o/p: true, 4,3
 */
public class ContinousSubArrayMultiple {
    public static void main(String[] args) {
        int i[] = {1,23,9,8,1};
        int key =9;
        ContinousSubArrayMultiple csa = new ContinousSubArrayMultiple();
        csa.find(i,key);
    }

    private void find(int[] i, int key) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(0,-1);
        int sum=0; boolean flag=false;
        for(int m=0;m<i.length;m++)
        {
            sum = sum+i[m];
            int temp = sum%key;
            if(!hm.containsKey(temp))
            {
                hm.put(temp,m);
            }
            else if(hm.containsKey(temp) && m - hm.get(temp)>1){

                int t = hm.get(temp)+1;
               System.out.println("The index is from :  "+t+"  to  "+ m);
               // hm.put(temp,m);
            }
        }
        if(flag)
        {
            System.out.println("found continuous subarray which is multiple of "+key);
        }
    }
}

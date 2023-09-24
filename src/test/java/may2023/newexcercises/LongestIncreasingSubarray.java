package may2023.newexcercises;

/**
 * @author achatterjee ON 5/5/23
 * @project testautomation
 */
//https://youtu.be/fV-TF4OvZpk
// https://youtu.be/fV-TF4OvZpk

import java.util.ArrayList;
import java.util.List;

/**
 * input : -1,3,4,5,9,2,8
 * o/p: -1,3,4,5,9 : count = 5
 */
public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        int in[] = {-1,3,4,5,9,0,0,0,0,0,101,2,103};;
        LongestIncreasingSubarray li= new LongestIncreasingSubarray();
        li.findSub(in);
    }

    private void findSub(int[] in) {
        int lis[] = new int[in.length];
        String temp="";
        int maxm=0;
        int[] soln = new int[in.length];
        String res = "";
        for(int j=0;j<in.length;j++)
        {
            lis[j]=1;
        }
        for(int j=1;j<in.length;j++)
        {
            temp="";
            for(int m=0;m<j;m++)
            {
                if(in[j]>in[m] && (1+lis[m])>lis[j])
                {
                    temp=temp+String.valueOf(in[m])+"  ";
                    if(1+lis[m]>maxm)
                     maxm=1+lis[m];
                    lis[j]=1+lis[m];


                }

            }
            if(res.length()<temp.length())
                res=temp;
        }
        System.out.println("\n\n"+maxm);
        System.out.println("\n\n"+res);
    }

}

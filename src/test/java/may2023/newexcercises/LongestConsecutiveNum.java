package may2023.newexcercises;

/**
 * @author achatterjee ON 5/6/23
 * @project testautomation
 */

import java.util.ArrayList;

/**
 * https://youtu.be/P6RZZMu_maU
 * i/p: {100,4,200,1,3,2}
 * o/p: 1,2,3,4
 */
public class LongestConsecutiveNum {
    public static void main(String[] args) {
        int[] in = {100,4,5,1,3,2};
        LongestConsecutiveNum seq = new LongestConsecutiveNum();
        seq.find(in);
    }

    private void find(int[] in) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int n=0;n<in.length;n++)
        {
            li.add(in[n]);
        }
        int max = 0;
        String s1="";
        for(int n=0;n<in.length;n++)
        {
            if(!li.contains(in[n]-1))
            {
                int length=0;
                String s = "";
                while(li.contains(in[n]+length))
                {
                    int temp = in[n]+length;
                    s = s+ ", "+String.valueOf(temp);
                    length=length+1;

                }
                max=Integer.max(max,length);
                if(s1.length()<s.length())
                    s1=s;
            }

        }
        System.out.println(max);
        System.out.println(s1);
    }
}

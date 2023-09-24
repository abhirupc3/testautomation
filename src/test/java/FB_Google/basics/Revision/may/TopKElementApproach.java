package FB_Google.basics.Revision.may;

import java.util.*;

/**
 * @author achatterjee ON 5/14/22
 * @project testautomation
 */
public class TopKElementApproach {
    public static void main(String[] args) {
        int[] i = {4,1,-1,2,-1,2,3};
         getTopKElements(i,2);
    }

    private static void getTopKElements(int[] i,int depth) {
      int max1=Integer.MIN_VALUE;
      int max2 = Integer.MIN_VALUE+1;
      int max3 = Integer.MIN_VALUE+2;
      for(int k=0;k<i.length;k++)
        {
            int num = i[k];
           if(num>max1)
           {
               max2=max1;
               max1=num;
           }
           else if(num<max1 && num>max2)
           {
               max3=max2;
               max2=num;
           }if(num<max1 && num<max2 && num>max3)
        {
            max3=num;
        }
        }
        System.out.println("The 1st max number is "+max1);
        System.out.println("The 2nd max number is "+max2);
        System.out.println("The 3rd max number is "+max3);
    }


}

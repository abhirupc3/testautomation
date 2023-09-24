package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/19/22
 * @project testautomation
 */
public class axSubArry {

    public static void main(String[] args) {
        int i[] = { 1, 2, 5, -7, -8, 9, 12, 13 };
        axSubArry as = new axSubArry();
        as.sub(i);
    }

    private void sub(int[] i) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int k=0;k<i.length;k++)
        {
           sum=sum+i[k];
           if(sum<0) {
               sum = 0;
               max=0;
           } else if(max<sum)
           {
               max=sum;
           }

        }
        System.out.println(sum);
    }
}

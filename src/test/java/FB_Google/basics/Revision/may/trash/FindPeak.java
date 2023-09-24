package FB_Google.basics.Revision.may.trash;

/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class FindPeak {
    public static void main(String[] args) {
        int i[] = {1,1,3,6};
        int peak = Integer.MIN_VALUE;
        for(int k=0;k<i.length-1;k++)
        {
           if(i[k]>i[k+1])
           {
             peak = i[k+1];
             break;
           }
        }
        if(peak==Integer.MIN_VALUE)
            peak=i[i.length-1];
        System.out.println("Peak is: "+peak);
    }
}

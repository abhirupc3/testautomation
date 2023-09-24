package FB_Google.basics.Revision.simple;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 * WAP to find the second highest number from an array.
 * for example input a={1,3,2,78,43,5,0,9}
 * output: 43
 */
public class SecondHighest {


    public static void main(String[] args) {
        SecondHighest sh = new SecondHighest();
        int[] a={1,3,2,78,43,5,0,9};
        sh.printSecondHighest(a);
    }

    private void printSecondHighest(int[] a) {
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;

        for(int y=0;y<a.length;y++)
        {
            if(a[y]>highest)
            {
                secondHighest=highest;
                highest=a[y];
            } else if(a[y]<highest && a[y]>secondHighest)
            {
                secondHighest=a[y];
            }
        }
        System.out.println("The second Highest number is: "+secondHighest);
    }
}

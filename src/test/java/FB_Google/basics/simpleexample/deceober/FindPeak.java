package FB_Google.basics.simpleexample.deceober;

/**
 * @author achatterjee ON 12/2/22
 * @project testautomation
 */
public class FindPeak {
    public static void main(String[] args) {
        FindPeak fp = new FindPeak();
        int i[] = {1,5,3,6};
        int in = fp.find(i);
        System.out.println("The value of eak is: "+in);
    }

    private int find(int[] i) {
        for(int k=0;k<i.length-1;k++)
        {
            if(i[k]>i[k+1])
            {
                return i[k];
            }
        }
        return i[i.length-1];
    }
}

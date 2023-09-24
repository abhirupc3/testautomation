package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/17/22
 * @project testautomation
 */
public class ArrayShift {

    public static void main(String[] args) {
        //int[] i = {1,2,3,54,6,7,8,98};
        int[] i = {1,2,3,4};
        ArrayShift sr = new ArrayShift();
        System.out.println("Before reversal");


        for(int n: i)
        {
            System.out.print(n+" ");
        }
        int q[] = sr.reverse(i,(i.length-2),(i.length-1));
         q = sr.reverse(i,(0),(i.length-3));
         q= sr.reverse(i,(0),(i.length-1));
        System.out.println("\n After Reversal");
        for(int n: q)
        {
            System.out.print(n+" ");
        }
    }

    private int[] reverse(int[] i,int si, int ei) {
        int p=si;
        int q=ei;
        while(p<q)
        {
            int temp = i[p];
            i[p]=i[q];
            i[q]=temp;
            p++;
            q--;
        }
        return i;
    }
}

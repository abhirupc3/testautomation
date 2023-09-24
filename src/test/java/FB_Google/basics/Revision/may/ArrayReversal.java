package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/17/22
 * @project testautomation
 */
public class ArrayReversal {

    public static void main(String[] args) {
        int[] i = {1,2,3,54,6,7,8,98};
        ArrayReversal sr = new ArrayReversal();
        System.out.println("Before reversal");
        for(int n: i)
        {
            System.out.print(n+" ");
        }
        sr.reverse(i);
        System.out.println("\n After Reversal");
        for(int n: i)
        {
            System.out.print(n+" ");
        }
    }

    private void reverse(int[] i) {

        int p=0;
        int q = i.length-1;

        while(p<=q)
        {
            int temp = i[p];
            i[p]=i[q];
            i[q]=temp;
            p++;q--;
        }



    }
}

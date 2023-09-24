package newPreperation.march2022;

/**
 * @author achatterjee ON 2/25/22
 * @project testautomation
 */
public class ArrayReversal {

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9};
        reverse(n);
    }

    private static void reverse(int[] n) {
        if(n==null)
            return;
        int p=0; int q = n.length-1;
        for(int i: n)
        {
            System.out.println(i);
        }
        while(p<q)
        {
            int temp = n[p];
            n[p]=n[q];
            n[q]=temp;
            p++;
            q--;
        }
        System.out.println("after reversal!!!");
        for(int m: n)
        {
            System.out.println(m);
        }
    }
}

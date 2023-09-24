package newPreperation.march2022;

/**
 * @author achatterjee ON 2/25/22
 * @project testautomation
 */
public class ArrayShift {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array");
        for(int m = 0; m<i.length;m++) {
            System.out.print(i[m]+" ");
        }
        //rightShift(i,2);
        leftShift(i,2);
    }



    private static void leftShift(int[] m, int shift)
    {
        int p=0;
        int q=shift-1;
        while(p<q)
        {
            int temp = m[p];
            m[p]=m[q];
            m[q]=temp;
            p++;
            q--;
        }
        p=shift;
        q=m.length-1;
        while(p<q)
        {
            int temp = m[p];
            m[p]=m[q];
            m[q]=temp;
            p++;
            q--;
        }
        p=0;
        q=m.length-1;
        while(p<q)
        {
            int temp = m[p];
            m[p]=m[q];
            m[q]=temp;
            p++;
            q--;
        }
        System.out.println("\nThe array after right shift of "+ shift);
        for(int e=0; e<m.length;e++) {
            System.out.print(m[e]+" ");
        }
    }
    private static void rightShift(int[] m, int shift)
    {
        int p=0;
        int q=m.length-shift-1;
        while(p<q)
        {
            int temp = m[p];
            m[p]=m[q];
            m[q]=temp;
            p++;
            q--;
        }
        p=m.length-shift;
        q=m.length-1;
        while(p<q)
        {
            int temp = m[p];
            m[p]=m[q];
            m[q]=temp;
            p++;
            q--;
        }
        p=0;
        q=m.length-1;
        while(p<q)
        {
            int temp = m[p];
            m[p]=m[q];
            m[q]=temp;
            p++;
            q--;
        }
        System.out.println("\nThe array after right shift of "+ shift);
        for(int e=0; e<m.length;e++) {
            System.out.print(m[e]+" ");
        }
    }
}

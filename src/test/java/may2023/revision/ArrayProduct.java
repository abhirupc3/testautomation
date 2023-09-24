package may2023.revision;

/**
 * @author achatterjee ON 6/10/23
 * @project testautomation
 */
public class ArrayProduct {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5};
        ArrayProduct pa = new ArrayProduct();
        pa.product(n);
    }

    private void product(int[] n) {
        int mul=1;
        int[] p = new int[n.length];
        int k=0;
        for(int i=n.length-1;i>=0;i--)
        {
           mul= mul*n[i];
        }
        for(int l=0;l<n.length;l++)
        {
            System.out.print(mul/n[l]);
            System.out.print(",");
        }
    }
}

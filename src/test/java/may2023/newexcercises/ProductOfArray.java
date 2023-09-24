package may2023.newexcercises;

/**
 * @author achatterjee ON 5/2/23
 * @project testautomation
 */

/**
 * Write an algorithm to create a product of array. for example if n[] = {1,2,3,4,5}
 * Then the product of array ans[i]= multiplication all elements except n[i] Hence the
 * output will be: {120,60,40,30,24}
 */

public class ProductOfArray {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5};
        ProductOfArray pOfA = new ProductOfArray();
        pOfA.findPruduct(n);
    }
    public void findPruduct(int[] n)
    {
        int prefix[] = new int[n.length];
        int postfix[] = new int[n.length];
        int p=1,q=1;

        for(int k=0;k<n.length;k++)
        {
            prefix[k]=p;
            p = p*n[k];
        }
        for(int k=n.length-1;k>=0;k--)
        {
            postfix[k] = prefix[k]*q;
            q=q*n[k];
        }

        for(int m=0;m<n.length;m++)
        {
            System.out.print(postfix[m]+" ");
        }
    }

}

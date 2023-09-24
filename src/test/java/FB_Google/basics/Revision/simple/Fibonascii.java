package FB_Google.basics.Revision.simple;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class Fibonascii {
    public static void main(String[] args) {
        Fibonascii fib = new Fibonascii();
        for(int i=0;i<8;i++)
        {
            //System.out.println(fib.fiboRec(i));
        }
        fib.fibo(8);
    }
     private void fibo(int i)
     {
         if(i==0)
         {
             System.out.println("0");
             return;
         }
         if(i==1)
         {
             System.out.println("0 1");
             return;
         }
         if(i==2)
         {
             System.out.println("0 1 1");
             return;
         }
         System.out.println("0 \n1 \n1");
         int p=1;
         int q=1;
        for(int x=2;x<i;x++)
        {
            System.out.println(p+q);
            int temp =q;
            q=p+q;
            p=temp;

        }

     }
    private int fiboRec(int i) {

        if(i==0||i==1)
            return i;
        return fiboRec(i-1)+fiboRec(i-2);
    }
}

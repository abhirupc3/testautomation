package FB_Google.basics.simpleexample;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class RevInt {
    public static void main(String[] args) {
        int x = 123;
        RevInt r = new RevInt();
        r.printRev(x);
    }

    private void printRev(int x) {
        System.out.println("The original int is: :"+x);
        int sum=0;
        while(x!=0)
        {
           sum = sum*10+x%10;
           x=x/10;
        }
        System.out.println("After reverse: "+sum);
    }
}

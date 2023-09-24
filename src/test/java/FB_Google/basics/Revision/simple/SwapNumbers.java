package FB_Google.basics.Revision.simple;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int x=12;
        int y=13;
        System.out.println("Before swap: x = "+x+" y= "+y);
        x= x+y;
        y=x-y;
        x=x-y;
        System.out.println("Before swap: x = "+x+" y= "+y);
    }
}

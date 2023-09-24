package misc.march2022;

/**
 * @author achatterjee ON 3/9/22
 * @project testautomation
 */
public class NumSwap {

    public static void main(String[] args) {
        int x = 123;
        int y=12;
        System.out.println("before swap:");
        System.out.println(x+","+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swap:");
        System.out.println(x+","+y);

    }
}

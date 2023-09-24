package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 3/5/22
 * @project testautomation
 */
public class digSum {
    public static void main(String[] args) {
        int i=123;
        int sum=0;
        while(i!=0)
        {
            sum=sum+i%10;;
            i=i/10;
        }
        System.out.println(sum);
    }
}

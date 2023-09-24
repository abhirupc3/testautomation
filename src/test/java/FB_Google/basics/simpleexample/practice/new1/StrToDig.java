package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/23/22
 * @project testautomation
 */
public class StrToDig {

    public static void main(String[] args) {
        char c = '-';
        System.out.println(c==45);

        calc("12345");
        calc("-43567");
    }

    private static void calc(String s) {
        char[] c = s.toCharArray();
        int sum = 0;
        for (int m = 0; m < c.length; m++)
        {
            if( c[0]!=45 && !Character.isDigit(c[m])) {
                System.out.println("Not a number");
                return;
            }
            sum= (int) (sum+Character.getNumericValue(c[m])*Math.pow(10,c.length-1-m));
        }

        if(sum<0)
        {
            sum= (int) (sum+Math.pow(10,c.length-1));
            sum=sum*-1;
        }

        System.out.println(sum);
    }
}

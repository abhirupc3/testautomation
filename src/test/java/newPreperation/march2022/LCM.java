package newPreperation.march2022;

/**
 * @author achatterjee ON 2/26/22
 * @project testautomation
 */
public class LCM {

    public static void main(String[] args) {
        int i1= 12; int i2=36;
        int res = lcm(i1,i2);
        System.out.println(res);
    }

    private static int lcm(int i1, int i2) {

       int n1=i1;
       int n2 =i2;
        while(i2!=0)
        {
            int temp =i1;
            i1=i2;
            i2=temp%i2;
        }
        return (n1*n2)/i1;
    }
}

package FB_Google.basics.Revision.may.trash;

/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class HcLc {
    public static void main(String[] args) {
        int i[] = {12,18,6,3};
        System.out.println(hc(12,18));
        System.out.println(lc(12,18));
    }

    private static int lc(int num1,int num2) {
        return (num1*num2)/hc(num1,num2);
    }

    private static int hc(int num1, int num2) {

        if(num1==0)
            return num2;
        return hc(num2%num1,num1);
    }


}

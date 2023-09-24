package FB_Google.basics.Revision.simple;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 * What is good number, If all the digits in the number is greater than the digits on it's right hand side
 * then the number is called Good Number; Fpr example 4321
 */
public class GoodNumber {
    public static void main(String[] args) {
        int x=4321;
        GoodNumber gn = new GoodNumber();
        gn.checkGoodNumber(x);
    }

    private void checkGoodNumber(int x) {
        int digit = x%10;
        x=x/10;
        boolean isGood=true;
        while(x!=0)
        {
            int previousNum = x%10;
            if(digit>previousNum)
            {
                isGood=false;
                break;
            }
            digit=previousNum;
            x=x/10;
        }
        if(isGood)
            System.out.println("This is a good Number");
        else
            System.out.println("This is not a good Number");
    }
}

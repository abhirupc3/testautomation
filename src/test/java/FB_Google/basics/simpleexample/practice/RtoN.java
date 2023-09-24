package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class RtoN {

    public static void main(String[] args) {
        RtoN r = new RtoN();
        String s = "V";
        r.printNum(s);

    }

    private void printNum(String s) {
        char[] c = s.toCharArray();
        int sum = getNumber(c[c.length-1]);
        for(int p=c.length-1;p>0;p--)
        {
            int curr = getNumber(c[p]);
            int prev = getNumber(c[p-1]);
            if(curr<=prev)
            {
                sum=sum+prev;
            }else{
                sum=sum-prev;
            }
        }
        System.out.println("The value is: "+sum);
    }

    public static int getNumber(char c)
    {
        int num = 0;
        switch (c) {
            case 'I' :
                num=1;
                break;
            case 'V':
                num=5;
                break;
            case 'X':
                num=10;
                break;
            case 'L':
                num=50;
                break;
            case 'C':
                num=100;
                break;
            case 'D':
                num=500;
                break;
            case 'M':
                num=1000;
                break;

        }
        return num;}
}

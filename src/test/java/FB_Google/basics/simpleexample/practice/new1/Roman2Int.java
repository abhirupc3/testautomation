package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/23/22
 * @project testautomation
 */
public class Roman2Int {

    public static void main(String[] args) {
        String s = "XXXVIII";
        int p=s.length()-1;
        int q = s.length()-2;
        int res=getNumber(s.charAt(s.length()-1));
        while(q>=0)
        {
            int temp=0;
            int n1 = getNumber(s.charAt(p--));
            int n2 = getNumber(s.charAt(q--));
            if(n2>=n1)
                res=res+n2;
            else
                temp=res-n2;
        }
        System.out.println(res);
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
        return num;
    }
}

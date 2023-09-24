package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/18/22
 * @project testautomation
 */
public class R2I {

    public static void main(String[] args) {
        String s = "XXIV";
        R2I r = new R2I();
        r.convert(s);
    }

    private void convert(String s) {
        char[] c = s.toCharArray();
        int sum = getNum(c[c.length-1]);
        int q=sum;
        for(int k=c.length-2;k>=0;k--)
        {
            int p = getNum(c[k]);
            if(p>=q)
                sum=sum+p;
            else
                sum=sum-p;
            q=p;
        }
        System.out.println(sum);
    }

    public int getNum(char c)
    {
        switch (c)
        {
            case 'X':
                return 10;
                case 'V':
                    return 5;
            case 'I':
                return 1;
        }
        return 0;
    }
}

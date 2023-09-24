package FB_Google.basics.Revision.simple.fb;

/**
 * @author achatterjee ON 3/12/22
 * @project testautomation
 */
public class LongestPalinodrome {
    public static void main(String[] args) {
        String s1 = "Abhirupracecar";
        LongestPalinodrome lonPal = new LongestPalinodrome();
        lonPal.findPal(s1);
    }

    private void findPal(String s1) {
        String s2="";
        for (int y=s1.length()-1;y>=0;y--)
        {
            s2=s2+s1.charAt(y);
        }
        String h = common(s1,s2);
    }

    private String common(String s1, String s2) {
        int t[][] = new int[s1.length()+1][s2.length()+1];
        int endsIndex=0;
        int length=0;
        for(int p=1;p<=s1.length();p++)
        {
            for(int q=1;q<=s2.length();q++)
            {
                if(s1.charAt(p-1)==s2.charAt(q-1))
                {
                    t[p][q]=t[p-1][q-1]+1;
                    if(length<t[p][q])
                    {
                        length=t[p][q];
                        endsIndex=p-1;
                    }
                }
            }

        }
        int count=0;
        while(count<length)
        {
            System.out.println(s1.charAt(endsIndex--));
            count++;
        }
        return "";
    }
}

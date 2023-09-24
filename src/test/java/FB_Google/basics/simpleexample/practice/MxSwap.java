package FB_Google.basics.simpleexample.practice;

import FB_Google.basics.simpleexample.MaximumSwap;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class MxSwap {
    public static void main(String[] args) {
        MxSwap m = new MxSwap();
        int p = m.maximumSwap(5929);
        System.out.println(p);
    }

    private int maximumSwap(int i) {
        String s = String.valueOf(i);
        char[] ch = s.toCharArray();
        int id1=0;
        int id2=0;
        int diff=0;
        boolean found =false;
        for(int k=0;k<ch.length;k++)
        {
            for(int l=1;l<ch.length;l++)
            {
                if(ch[k]<ch[l] && diff<=ch[l]-ch[k])
                {
                    diff = ch[l]-ch[k];
                    id1=k;
                    id2=l;
                    found=true;
                }
            }
            if(found)
                break;
        }
        char temp = ch[id1];
        ch[id1]=ch[id2];
        ch[id2]=temp;
        int il = Integer.parseInt(String.valueOf(ch));
        return il;

    }
}

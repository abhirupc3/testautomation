package may2023.newexcercises;

/**
 * @author achatterjee ON 5/1/23
 * @project testautomation
 */

/**
 * Write an algorithm to compress characters of a given String.
 * input: aaaaabccdddddefghe
 * output: a5bc2d5efghe
 */
public class CharCompressing {
    public static void main(String[] args) {
        String in = "aaaaabccdddddefgheeeeeef";
        CharCompressing cComp = new CharCompressing();
        cComp.compress(in);
    }

    private void compress(String i) {
        int p = 0;
        int q = 1;
        int count = 1;
        StringBuffer sb = new StringBuffer();
        while(q<i.length())
        {
            if(i.charAt(q)==i.charAt(p))
            {
                count=count+1;
                q=q+1;
            } else{
                String s = count==1 ? String.valueOf(i.charAt(p)) : String.valueOf(i.charAt(p)) + count;
                sb.append(s);
                p=q;q=q+1;
                count=1;
            }
        }
        String s = count==1 ? String.valueOf(i.charAt(p)) : String.valueOf(i.charAt(p)) + count;
        sb.append(s);
        System.out.println(sb.toString());
    }
}

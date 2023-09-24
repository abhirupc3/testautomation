package FB_Google.basics.simpleexample.practice;

/**
 * @author achatterjee ON 2/5/22
 * @project testautomation
 */
public class LongComSub {

    public static void main(String[] args) {
        String s1 = "abhirup";
        String s3 = "Chattabhiruperjee";
        findCommon(s1,s3);
    }

    private static void findCommon(String s1, String s3) {

        int den[][] =new int [(s1.length()+1)][(s3.length()+1)];
        int max=0;
        int endIndex=0;
        for(int s1Pointer=1;s1Pointer<s1.length();s1Pointer++)
        {
            for(int s3Pointer=1;s3Pointer<s3.length();s3Pointer++)
            {
                if(s1.charAt(s1Pointer-1)==s3.charAt(s3Pointer-1))
                {
                    den[s1Pointer][s3Pointer] = den[s1Pointer-1][s3Pointer-1]+1;
                }
                if(max<den[s1Pointer][s3Pointer])
                {
                    max = den[s1Pointer][s3Pointer];
                    endIndex=s1Pointer;
                }
            }
        }
        for(int p=endIndex-max;p<endIndex;p++)
        {
            System.out.print(s1.charAt(p));
        }
    }
}

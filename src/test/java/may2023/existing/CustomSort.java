package may2023.existing;

/**
 * @author achatterjee ON 5/8/23
 * @project testautomation
 */
public class CustomSort {
    public static void main(String[] args) {
        String order = "cba";
        String s = "Wabcdc";
        CustomSort cSort = new CustomSort();
        cSort.sort(s,order);
    }

    private void sort(String s, String order) {
        String s1="";
        String s2="";
        for(int m =0; m<s.length();m++)
        {
            boolean match=false;
            if(order.contains(String.valueOf(s.charAt(m)))){
                s1 = String.valueOf(s.charAt(m))+s1;
            }
            else
            {
                s2=s2+String.valueOf(s.charAt(m));
            }
        }
        System.out.println(s1+s2);
    }
}

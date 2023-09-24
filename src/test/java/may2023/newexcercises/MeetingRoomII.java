package may2023.newexcercises;
import java.util.*;
/**
 * @author achatterjee ON 5/7/23
 * @project testautomation
 */
// https://youtu.be/FdzJmTCVyJU
public class MeetingRoomII {
    public static void main(String[] args) {
        int [][] in = {{3,30},{5,10},{15,20},{20,21}};
        MeetingRoomII miII = new MeetingRoomII();
        miII.find(in);
    }

    private void find(int[][] in) {
        Stack<int[]> st = new Stack<int[]>();
        Arrays.sort(in,(a, b)->Integer.compare(a[0], b[0]));
        int[] t = {in[0][0],in[0][1]};
        st.push(t);
        int count=1;
        for(int m =1; m<in.length;m++)
        {
            int[] x = st.peek();
            int[] t1 = {in[m][0],in[m][1]};
            if(x[1]>in[m][0])
            {
               count=count+1;
            }
            st.push(t1);
        }
        System.out.println("Total number of meeting rooms required are: "+count);
    }
}
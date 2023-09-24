package may2023.newexcercises;

import java.util.*;

/**
 * @author achatterjee ON 5/7/23
 * @project testautomation
 */
public class MergeInterval {
    public static void main(String[] args) {
        int[][]  n = {{1,2},{3,5},{4,8},{6,7},{8,10},{12,16}};
        MergeInterval mi = new MergeInterval();
        mi.merge2(n);
    }

    private void merge(int[][] n) {
        Arrays.sort(n, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> st = new Stack<int[]>();
        int q=0;
        for(int p=1;p<n.length;p++)
        {
            if(n[q][1]>=n[p][0]) {
                int temp[] = {n[q][0],Integer.max(n[q][1],n[p][1])};
                st.add(temp);
                q=q+1;
            } else{
                int temp[] = {n[p][0],n[p][1]};
                st.add(temp);
                q=q+1;
            }

        }

        while(!st.isEmpty()) {
            int [] x = st.pop();
            System.out.println(x[0]+","+x[1]);
        }

    }
    private void merge2(int[][] n) {
        Arrays.sort(n, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> st = new Stack<int[]>();
        int[] s = {n[0][0],n[0][1]};
        st.add(s);
        for(int p=1;p<n.length;p++)
        {
            if(st.peek()[1]>=n[p][0]) {
                int[] temp = st.pop();
                int i [] = {temp[0],Integer.max(temp[1],n[p][1])};
                st.push(i);
            } else{
                int temp[] = {n[p][0],n[p][1]};
                st.push(temp);
            }

        }
        for(int i=0;i<st.size();i++)
        {

            System.out.println(st.get(i)[0]+","+st.get(i)[1]);
        }

    }
}

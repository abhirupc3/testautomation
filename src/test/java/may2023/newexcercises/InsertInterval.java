package may2023.newexcercises;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author achatterjee ON 5/7/23
 * @project testautomation
 */
public class InsertInterval {
    public static void main(String[] args) {
        int[][]  n = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int m[] = {4,8};
        int t[][] = new int[n.length+1][2];
        for(int y=0;y<n.length;y++)
        {
            t[y][0]=n[y][0];
            t[y][1]=n[y][1];
        }
        t[n.length][0]=4;
        t[n.length][1]=8;
        InsertInterval mi = new InsertInterval();
        mi.merge2(t);
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

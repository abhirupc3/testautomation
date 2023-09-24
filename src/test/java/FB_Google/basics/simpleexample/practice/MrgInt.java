package FB_Google.basics.simpleexample.practice;

import FB_Google.basics.simpleexample.MergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class MrgInt {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{2,3}};
        MrgInt mi = new MrgInt();
        int res[][] = mi.merIntervals(intervals);
        for(int p=0; p<res.length;p++)
        {
            System.out.println("["+res[p][0]+","+res[p][1]+"]");
        }
    }

    private  int[][] merIntervals(int[][] intervals) {
        List<Interval> li = new ArrayList<>();
        for(int k=0;k<intervals.length; k++)
        {
            li.add(new Interval(intervals[k][0],intervals[k][1]));
        }
        Collections.sort(li);
        Stack<Interval> st = new Stack<>();
        st.push(li.get(0));
        li.remove(0);
        while(!li.isEmpty())
        {
            Interval in = li.get(0);
            Interval inN = st.peek();
            if(inN.y>=in.x)
            {
                inN.y=Math.max(in.y,inN.y);
                st.pop();
                st.push(inN);
            } else{
                st.push(in);
            }
            li.remove(0);
        }
        int i[][] = new int[st.size()][2];
        int l=0;
        while(!st.isEmpty())
        {
            Interval inte = st.pop();
           i[l][0] = inte.x;
           i[l][1] = inte.y;
           l++;
        }
        return i;
    }

    class Interval implements Comparable<Interval>{
        int x =0;
        int y =0;
        Interval(int x, int y)
        {
            this.x=x;
            this.y=y;
        }
        public int compareTo(Interval i)
        {
            return this.x-i.x;
        }
    }
}

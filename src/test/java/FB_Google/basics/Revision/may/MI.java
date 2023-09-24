package FB_Google.basics.Revision.may;

import java.util.*;

/**
 * @author achatterjee ON 5/19/22
 * @project testautomation
 */
public class MI {

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{2,3}};
        MI mi = new MI();
        mi.merge(intervals);
    }

    private void merge(int[][] x) {
        List<Interval> li = new ArrayList<Interval>();
        for(int k=0;k<x.length;k++)
        {
            li.add(new Interval(x[k][0],x[k][1]));
        }
        Collections.sort(li);
        Stack<Interval> st = new Stack<Interval>();
        st.push(li.get(0));
        li.remove(0);
        while(!li.isEmpty())
        {
            Interval it = li.get(0);
            Interval i =st.peek();
            if(i.y>=it.x)
            {
                st.push(new Interval(st.pop().x,Math.max(i.y,it.y)));
            } else{
                st.push(new Interval(it.x,it.y));
            }
            li.remove(0);
        }

        for(Interval i: st)
        {
            System.out.println(i.x+"  "+i.y);
        }
    }

    class Interval implements Comparable<Interval>{
        int x;
        int y;
        public Interval(int x, int y)
        {
            this.x=x;
            this.y=y;
        }
        @Override
        public int compareTo(Interval o) {
            return this.x-o.x;
        }
    }
}

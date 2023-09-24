package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class MergInt {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{5,8},{2,3},{8,9}};
        MergInt mi = new MergInt();
        mi.merge(intervals);
    }

    private void merge(int[][] intervals) {

        List<Int> li = new ArrayList<Int>();
        Stack<Int> st = new Stack<Int>();
        for(int k=0;k< intervals.length;k++)
        {
            li.add(new Int(intervals[k][0],intervals[k][1]));
        }
        Collections.sort(li);

        while(!li.isEmpty())
        {
            if(st.isEmpty())
            {
                st.push(li.get(0));
            } else{
                if(st.peek().y>=li.get(0).x)
                {
                    st.push(new Int(st.pop().x,li.get(0).y));
                } else{
                    st.push(new Int(li.get(0).x,li.get(0).y));
                }
            }
            li.remove(0);
        }

        while(!st.isEmpty())
        {
            Int i = st.pop();
            System.out.println(i.x+"  "+i.y);
        }
    }


    class Int implements Comparable<Int>
    {
        int x;
        int y;
        public Int(int x, int y)
        {
            this.x=x;
            this.y=y;
        }

        @Override
        public int compareTo(Int o) {
            return this.x-o.x;
        }
    }
}

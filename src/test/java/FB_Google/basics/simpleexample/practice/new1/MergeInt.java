package FB_Google.basics.simpleexample.practice.new1;

import FB_Google.basics.simpleexample.MergeIntervals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author achatterjee ON 2/22/22
 * @project testautomation
 */
public class MergeInt {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{2,3}};
        MergeInt mi = new MergeInt();
        int[][] res = mi.merge(intervals);
        for(int p=0; p<res.length;p++)
        {
            System.out.println("["+res[p][0]+","+res[p][1]+"]");
        }
    }

    private int[][] merge(int[][] intervals) {

        List<Interval> intList = new ArrayList<>();
        Stack<Interval> intSt = new Stack<Interval>();
        for(int i=0;i< intervals.length;i++)
        {
            int in[] = intervals[i];
            intList.add(new Interval(in[0],in[1]));
        }
        intSt.push(new Interval(intList.get(0).x,intList.get(0).y));
        intList.remove(0);
        while(!intList.isEmpty())
        {
            if(intList.get(0).x<=intSt.peek().y)
            {
                int x = intSt.peek().x;
                int y = Math.max(intList.get(0).y,intSt.peek().y);
                intSt.pop();
                intSt.push(new Interval(x,y));
                intList.remove(0);
            } else{
                intSt.push(new Interval(intList.get(0).x,intList.get(0).y));
            }
        }
        int[][] result=new int[intSt.size()][2];
        for(int m=0 ; m<intSt.size();m++)
        {
            Interval in = intSt.pop();
            result[m][0] = in.x;
            result[m][1]= in.y;

        }
        return result;
    }
}

class Interval implements Comparable<Interval>{
    int x=0;
    int y=0;
    Interval(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Interval o) {
        return  this.x-o.x;
    }
}

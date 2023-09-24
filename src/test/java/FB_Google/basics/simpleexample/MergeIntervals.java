package FB_Google.basics.simpleexample;

import java.util.*;

/**
 * @author achatterjee ON 2/13/22
 * @project testautomation
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{2,3}};
        MergeIntervals mi = new MergeIntervals();
        int[][] res = mi.merge(intervals);
        for(int p=0; p<res.length;p++)
        {
            System.out.println("["+res[p][0]+","+res[p][1]+"]");
        }
    }
    public int[][] merge(int[][] intervals) {
        int[][] mergedInt ;
        Stack<Interval> resultSt = new Stack<>();
        List<Interval> xList = new ArrayList<>();
    for(int count =0 ;count<intervals.length;count++)
    {
        int temp[] = intervals[count];
        xList.add(new Interval(temp[0],temp[1]));
    }

        Collections.sort(xList,Collections.reverseOrder());
        resultSt.push(xList.get(0));
        xList.remove(0);
        while(!xList.isEmpty())
        {
            if(xList.get(0).x<=resultSt.peek().y)
            {
                Interval i = resultSt.pop();
                resultSt.push(new Interval(i.x,Math.max(xList.get(0).y,i.y)));
                xList.remove(0);
            } else{
                resultSt.push(new Interval(xList.get(0).x,xList.get(0).y));
                xList.remove(0);
            }
        }

        int pos=0;
        mergedInt = new int[resultSt.size()][2];
        for(Interval inter : resultSt) {
            mergedInt[pos][0]=inter.x;
            mergedInt[pos][1]=inter.y;
            pos++;
        }
        return mergedInt;
    }
    }
class Interval implements Comparable<Interval>{
    int x;
    int y;
    Interval(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Interval i)
    {
        return i.x-this.x;
    }

}

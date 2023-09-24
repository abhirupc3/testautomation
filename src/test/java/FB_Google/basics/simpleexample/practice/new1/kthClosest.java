package FB_Google.basics.simpleexample.practice.new1;

import FB_Google.basics.simpleexample.KClosestPointsToOrigin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author achatterjee ON 2/19/22
 * @project testautomation
 */
public class kthClosest {
    public static void main(String[] args) {
        int x[][] = {{3,3},{-2,4},{5,-1}};
        //int x[][] = {{0,1},{1,0}};
        int[][] m = new kthClosest().kClosest(x,2);
        for(int n=0;n<2;n++ )
        {
            System.out.println(m[n][0]+","+m[n][1]);
        }
    }

    private int[][] kClosest(int[][] x, int i) {
        List<Comp> lis = new ArrayList<Comp>();
          for(int m=0;m<x.length;m++)
          {
              int sq = square(x[m]);
              lis.add(new Comp(x[m][0],x[m][1],sq));
          }
        Collections.sort(lis, Collections.reverseOrder());
        int res[][]=new int [lis.size()][2]; int counter=0;
        for(Comp i1:lis)
        {
            res[counter][0]=i1.x;
            res[counter][1]=i1.y;
            counter++;
        }
        return res;
    }

     public int square(int[] x)
     {
         int m = x[0]*x[0]+x[1]*x[1];
         return m;
     }

}
class Comp implements Comparable<Comp>{
    int x;
    int y;
    int dist;
    public Comp(int x,int y,int dist)
    {
       this.x=x;
       this.y=y;
       this.dist=dist;
    }

    public int compareTo(Comp c)
    {
       int temp = c.dist-this.dist;
       return temp;
    }
}
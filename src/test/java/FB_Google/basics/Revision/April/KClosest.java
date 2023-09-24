package FB_Google.basics.Revision.April;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author achatterjee ON 4/19/22
 * @project testautomation
 */
public class KClosest {
    public static void main(String[] args) {
        int x[][] = {{1,1},{3,3},{-2,4},{5,-1}};
        kclosest(x,3);
    }

    private static void kclosest(int[][] x, int i) {
        List<Axis> aList = new ArrayList<Axis>();

        for(int y=0;y<x.length;y++)
        {
            int dist = (int) Math.sqrt(x[y][0]*x[y][0]+x[y][1]*x[y][1]);
            aList.add(new Axis(x[y][0],x[y][1],dist));

        }
        Collections.sort(aList);
        for(int k=0;k<i;k++)
        {
            System.out.println(aList.get(k).co[0] +" "+aList.get(k).co[1]);
        }
    }


    static class Axis implements Comparable<Axis>{
        int x;
        int y;
        int dist;
        int[] co;
        public Axis(int x, int y, int dist)
        {
            this.x=x;
            this.y=y;
            this.dist=dist;
            this.co=new int[]{x,y};
        }

        @Override
        public int compareTo(Axis o) {
            return this.dist-o.dist;
        }
    }
}

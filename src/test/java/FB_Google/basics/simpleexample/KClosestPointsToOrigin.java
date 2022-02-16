package FB_Google.basics.simpleexample;

import java.util.*;

/**
 * @author achatterjee ON 2/8/22
 * @project testautomation
 */
public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        //int x[][] = {{3,3},{-2,4},{5,-1}};
        int x[][] = {{0,1},{1,0}};
        int[][] m = new KClosestPointsToOrigin().kClosest(x,2);
        for(int n=0;n<2;n++ )
        {
            System.out.println(m[n][0]+","+m[n][1]);
        }
    }
    public  int[][] kClosest(int[][] points, int k) {
       List<Axis> li = new ArrayList<Axis>();
        int[][] closestPoint ;
        for (int[] point: points)
        {
            int distance = getSquare(point);
            int xpoint = point[0];
            int ypoint = point[1];
            li.add(new Axis(xpoint,ypoint,distance));
        }
        int m = 0;
        Collections.sort(li);
        int result[][]=new int[k][];
        for (int l=0;l<k;l++)
        {
            result[l]=li.get(l).coordinate;
        }
        return result;

    }
  class Axis implements Comparable<Axis>{
        int xVal;
        int yVal;
        int distance;
      int coordinate[];
        Axis(int xVal,int yVal,int distance)
        {
            this.xVal=xVal;
            this.yVal=yVal;
            coordinate = new int[]{xVal, yVal};
            this.distance=distance;

        }

      @Override
      public int compareTo(Axis o) {
          return this.distance-o.distance;
      }
  }
    public int getSquare(int[] point)
    {
        return point[0]*point[0]+point[1]*point[1];
    }
}

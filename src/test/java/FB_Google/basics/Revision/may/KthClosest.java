package FB_Google.basics.Revision.may;
import java.util.*;
import FB_Google.basics.simpleexample.KClosestPointsToOrigin;

/**
 * @author achatterjee ON 5/15/22
 * @project testautomation
 */
public class KthClosest {
    public static void main(String[] args) {
        int x[][] = {{3, 3}, {-2, 4}, {5, -1}};
         new KthClosest().kClosest(x, 3);

    }

    private void kClosest(int[][] x, int i) {

       List<Dist> li = new ArrayList<Dist>();
        for (int k = 0; k < x.length; k++) {
            int X = x[k][0];
            int Y = x[k][1];
            int dist = X * X + Y * Y;
            li.add(new Dist(X,Y,dist));
        }
        Collections.sort(li);
        int count=0;
        while(count<3)
        {
            System.out.println(li.get(count).x +"  "+li.get(count).y);
            System.out.println(li.get(count).dist);
            count++;
        }

    }

    class Dist implements Comparable<Dist> {
        int x = 0, y = 0, dist=0;

        public Dist(int x, int y,int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        @Override
        public int compareTo(Dist o) {
            return this.dist-o.dist;
        }
    }
}

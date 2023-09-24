package FB_Google.basics.simpleexample.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author achatterjee ON 3/5/22
 * @project testautomation
 */
public class KClose {
    public static void main(String[] args) {
        int x[][] = {{3,3},{-2,4},{5,-1}};
        int k=3;
        KClose kc = new KClose();
        kc.printKClose(x,k);
    }

    private  void printKClose(int[][] x, int k) {

        List<Elementz> list = new ArrayList<Elementz>();
        for(int i=0;i<x.length;i++)
        {
            int xPoint = x[i][0];
            int yPoint = x[i][1];
            int dist = findDist(xPoint,yPoint);
            list.add(new Elementz(xPoint,yPoint,dist));
        }
        Collections.sort(list);
        for(int i=0; i<k; i++)
        {
            Elementz el = list.get(i);
            System.out.print(el.x+","+el.y);
            System.out.println("\n");
        }
    }

    private static int findDist(int xPoint, int yPoint) {
        int res = xPoint*xPoint+yPoint*yPoint;
        return res;
    }

    class Elementz implements Comparable<Elementz> {
        int x = 0;
        int y = 0;
        int dist = 0;

        Elementz(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        public int compareTo(Elementz el)
        {
            return this.dist-el.dist;
        }
    }
}

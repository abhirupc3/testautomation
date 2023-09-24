package FB_Google.basics.simpleexample.deceober;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author achatterjee ON 12/2/22
 * @project testautomation
 */
public class KthClosest {
    public static void main(String[] args) {
        int x[][] = {{3,3},{-2,4},{5,-1}};
        KthClosest kth = new KthClosest();
        kth.findClosest(x,3);
    }

    private void  findClosest(int[][] x,int n) {
        List<Position> li = new ArrayList<Position>();
        for(int i=0;i<x.length;i++)
        {
            int xPos = x[i][0];
            int yPos = x[i][1];
            li.add(new Position(xPos,yPos));
        }
        Collections.sort(li);
        for(int m=0;m<n;m++)
        {
            Position pos = li.get(m);
            System.out.println(pos.xPos+","+pos.yPos);
        }

    }

    class Position implements Comparable<Position>
    {
    int xPos;
    int yPos;
    int dist;
    int[][] coOrd;
    public Position(int xPos,int yPos)
    {
        this.xPos=xPos;
        this.yPos=yPos;
        dist=(xPos*xPos)+(yPos*yPos);
    }
        @Override
        public int compareTo(Position o) {
            return this.dist-o.dist;
        }
    }
}

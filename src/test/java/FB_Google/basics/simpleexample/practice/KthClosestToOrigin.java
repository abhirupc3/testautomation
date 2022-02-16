package FB_Google.basics.simpleexample.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author achatterjee ON 2/13/22
 * @project testautomation
 */
public class KthClosestToOrigin {
    class Position implements Comparable<Position>{
        int xPos;
        int yPos;
        int distance;
        Position(int xPos,int yPos,int distance)
        {
            this.xPos=xPos;
            this.yPos=yPos;
            this.distance=distance;
        } public int compareTo(Position pos)
        {
            return this.distance-pos.distance;
        }
    }
    public int square(int xpos,int ypos)
    {
        return (xpos*xpos+ypos*ypos);
    }
    public static void main(String[] args) {
        KthClosestToOrigin k = new KthClosestToOrigin();
        List<Position> distanceList = new ArrayList<Position>();
        int x[][] = {{0,1},{1,0},{2,3},{5,6},{7,8}};
        int target =5;
        for(int[] values: x)
        {
            int distance = k.square(values[0],values[1]);
            distanceList.add(k.new Position(values[0],values[1],distance));
        }

        Collections.sort(distanceList);
        for(int counter=0;counter<target;counter++)
        {
            Position posi = distanceList.get(counter);
            System.out.println(posi.distance);
        }

    }
}

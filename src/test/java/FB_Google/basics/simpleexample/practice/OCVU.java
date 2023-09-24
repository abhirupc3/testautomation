package FB_Google.basics.simpleexample.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author achatterjee ON 3/6/22
 * @project testautomation
 */
public class OCVU {
    public static void main(String[] args) {
        int[] heights =  {4,3,5,1};
        printOceanViewBuildings(heights);
    }

    private static void printOceanViewBuildings(int[] heights) {

        List<Integer> li = new ArrayList<>();
        li.add(heights[0]);
        for(int y=1; y<heights.length;y++)
        {
           while(!li.isEmpty()&& li.get(0)<heights[y])
           {
               {
                   li.remove(0);
               }
           }
           li.add(heights[y]);
        }
        for(int y:li)
        {
            System.out.print(y+ " ");
        }
    }
}

package FB_Google.basics.simpleexample.practice.new1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author achatterjee ON 2/23/22
 * @project testautomation
 */
public class OcnVu {
    public static void main(String[] args) {
        int[] heights =  {4,3,2,1};
        printOceanViewBuildings(heights);
    }

    private static void printOceanViewBuildings(int[] heights) {

        List<Integer> bList = new ArrayList<Integer>();

        for(int m=0;m<heights.length;m++){
            while(!bList.isEmpty() && bList.get(bList.size()-1)<heights[m])
            {
                bList.remove(bList.size()-1);
            }
            bList.add(heights[m]);
        }
        for(Integer i: bList)
        {
            System.out.println(i);
        }
    }
}

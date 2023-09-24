package FB_Google.basics.Revision.simple.fb;

import java.util.ArrayList;
import java.util.List;

/**
 * @author achatterjee ON 3/12/22
 * @project testautomation
 */
public class OceanView {
    public static void main(String[] args) {
        int[] heights =  {4,7,9,1};
        OceanView ocVu = new OceanView();
        ocVu.printOceanViewBuildings(heights);
    }

    private void printOceanViewBuildings(int[] heights) {
        List<Integer> li = new ArrayList<>();
        for(int k=0;k<heights.length;k++)
        {
           while(!li.isEmpty()&&li.get(0)<heights[k])
            {
                    li.remove(0);
            }
            li.add(heights[k]);
        }
        System.out.println("The Ocean View Buildings are: \n");
        for(int y: li)
        {
            System.out.print(y+ " ");
        }
    }
}

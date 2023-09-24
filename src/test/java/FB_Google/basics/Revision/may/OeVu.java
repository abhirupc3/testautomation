package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/19/22
 * @project testautomation
 */
public class OeVu {
    public static void main(String[] args) {
        int[] heights =  {4,7,4,9};
        OeVu cv = new OeVu();
        cv.find(heights);
    }

    private void find(int[] heights) {
        List<Integer> li = new ArrayList<Integer>();


        for(int k=0;k<heights.length;k++)
        {
            if(!li.isEmpty() && li.get(0)<heights[k])
            {
               li.remove(0);
            }
                li.add(heights[k]);

        }

        for(int k: li)
        {
            System.out.print(k+" ");
        }
    }
}

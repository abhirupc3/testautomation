package may2023.newexcercises;
import java.util.*;
/**
 * @author achatterjee ON 5/1/23
 * @project testautomation
 */

/**
 * Write a java algorithm to check the duplicate:
 * input : {1,2,3,4,5,6,7,8,9,1}
 * output: true.
 */
public class DuplicateCheck {
    public static void main(String[] args) {
        DuplicateCheck dc = new DuplicateCheck();
        int[] data = {1,2,3,4,5,6,7,8,9,3,112};
        dc.dupCheck(data);
    }

    private void dupCheck(int[] data) {
        List<Integer> l = new ArrayList<Integer>();
        for(int m=0; m<data.length; m++)
        {
            if(l.contains(data[m]))
            {
                System.out.println("true");
                return;
            } else{
                l.add(data[m]);
            }
        }
        System.out.println("false");
    }
}

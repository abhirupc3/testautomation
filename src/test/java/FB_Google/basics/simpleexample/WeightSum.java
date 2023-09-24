package FB_Google.basics.simpleexample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author achatterjee ON 2/9/22
 * @project testautomation
 * ou are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists.
 *
 * The depth of an integer is the number of lists that it is inside of. For example, the nested list [1,[2,2],[[3],2],1] has each integer's value set to its depth.
 *
 * Return the sum of each integer in nestedList multiplied by its depth.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: nestedList = [[1,1],2,[1,1]]
 * Output: 10
 * Explanation: Four 1's at depth 2, one 2 at depth 1. 1*2 + 1*2 + 2*1 + 1*2 + 1*2 = 10.
 * Example 2:
 *
 *
 * Input: nestedList = [1,[4,[6]]]
 * Output: 27
 * Explanation: One 1 at depth 1, one 4 at depth 2, and one 6 at depth 3. 1*1 + 4*2 + 6*3 = 27.
 */
public class WeightSum {

    public static void main(String[] args) {
    List<NestedInteger> li = new ArrayList<NestedInteger>();
        int sum = depthSum(li);
    }
    static int depth=1;
    static int sum=0;
    static int res=0;
    public static int depthSum(List<NestedInteger> nestedList) {

        int sum = sum(nestedList,1);
        return sum;

    }
    public static int sum(List<NestedInteger> nestedList,int depth)
    {

        for(NestedInteger nl:nestedList)
        {
            if(nl.isInteger())
            {
                res=res+nl.getInteger()*depth;
            } else{
                sum(nl.getList(),depth+1);
            }
        }
        return res;
    }

}
class NestedInteger {

    public boolean isInteger() {
        return false;
    }

    public int getInteger() {
        return 1;
    }

    public List<NestedInteger> getList() {
        return new ArrayList();
    }
}

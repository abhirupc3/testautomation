package may2023.newexcercises;

/**
 * @author achatterjee ON 5/3/23
 * @project testautomation
 */

/**
 * https://youtu.be/UuiTKBwPgAo
 * height: {1,8,6,2,5,4,8,3,7}, distance between each item is 1.; now find the maximum area.
 */
public class ContainerWithMaxArea {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMaxArea max = new ContainerWithMaxArea();
        max.finMaxArea(height);
    }

    private void finMaxArea(int[] height) {
        int l=0; int r =height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(l<r)
        {
            int length = Integer.min(height[l],height[r]);
            int max = length*(r-l);
            maxArea = Integer.max(maxArea,max);
            if(l<r)
                l=l+1;
            else
                r=r-1;
        }
        System.out.println("The maximum area is: "+maxArea);
    }
}

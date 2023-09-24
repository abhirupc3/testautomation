package may2023.newexcercises;

/**
 * @author achatterjee ON 5/1/23
 * @project testautomation
 * Write an algorithm to find the maximum profit from the given prices of a stock array.
 * input: [7,1,5,4,3,6,9]
 */
public class SlidingWindow {
    public static void main(String[] args) {
        int[] i = new int[]{7,3,5,4,3,6,9,1};
        SlidingWindow sw = new SlidingWindow();
        sw.printMaxProfit(i);
    }

    private void printMaxProfit(int[] i) {
        int left=0;
        int right=1;
        int maxProfit = Integer.MIN_VALUE;
        int diff=0;
        int buyVal=0;
        int sellVal=0;
        for(right=1;right<i.length;right++)
        {
            if(i[left]>i[right])
            {
                left=right;

            } else{
               diff = i[right]-i[left];
               maxProfit = Integer.max(diff,maxProfit);
               buyVal = i[left];
               sellVal= i[right];
            }

        }
        System.out.println("The buy value is: "+buyVal);
        System.out.println("The sell value is: "+sellVal);
        System.out.println("The maximum profit value is: "+maxProfit);
    }
}

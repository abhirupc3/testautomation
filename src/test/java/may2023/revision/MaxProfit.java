package may2023.revision;

/**
 * @author achatterjee ON 6/10/23
 * @project testautomation
 */
public class MaxProfit {
    public static void main(String[] args) {
        int n[] =  new int[]{7,3,5,4,3,6,9,1};
        MaxProfit mp = new MaxProfit();
        mp.findMax(n);
    }

    private void findMax(int[] n) {
        int left=0;
        int right=1;
        int diff=0;
        int maxProfit = Integer.MIN_VALUE;
        for(int k=0;k<n.length;k++)
        {
            if(n[left]>n[right])
            {
                left=right;
                right++;
            } else{
                diff = n[right]-n[left];
                maxProfit = Integer.max(maxProfit,diff);
            }
        }
        System.out.println("Buy value: "+left);
        System.out.println("Sell value: "+right);
        System.out.println("Profit value: "+maxProfit);
    }
}

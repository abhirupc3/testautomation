package may2023.newexcercises;

/**
 * @author achatterjee ON 5/3/23
 * @project testautomation
 */

/**
 * Find the missing number from the array of the n distinct number, for example input: [0,1,2,3,5] o/p is 4
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] i = {0,1,2,3,5};
        MissingNumber mn = new MissingNumber();
        mn.getNum(i,5);
    }

    private void getNum(int[] i,int k) {
        int total = k*(k+1)/2;
        int sum=0;
        for(int m=0;m<i.length;m++)
        {
            sum=sum+i[m];
        }
        System.out.println(total-sum);
    }
}

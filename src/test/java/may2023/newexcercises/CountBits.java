package may2023.newexcercises;

/**
 * @author achatterjee ON 5/3/23
 * @project testautomation
 */

/**
 * Write an algorithm to count number of 1s in a binary number.
 * input:00000000000000000000000000001011
 * output: 3
 */
public class CountBits {
    public static void main(String[] args) {
        //int in = 0000000000000000000000000011111;
        int in =   0B0011;
        CountBits cb = new CountBits();
        cb.printCount(in);
    }

    private void printCount(int in) {
        int result=0;
        while(in!=0)
        {
            result=result + in%2;
            in = in >> 1;
        }
        System.out.println("The count of 1s are: "+result);
    }
}

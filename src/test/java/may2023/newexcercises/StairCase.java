package may2023.newexcercises;

/**
 * @author achatterjee ON 5/3/23
 * @project testautomation
 */
//https://youtu.be/Y0lT9Fck7qI

/**
 * Write an algorithm to find how many different way we can reach the top of the stair case, considering we can make one step or
 * two steps together.
  */
public class StairCase {
    public static void main(String[] args) {
        int n=5;
        StairCase sc =  new StairCase();
        sc.find(n);
    }

    private void find(int n) {
        int dp[] = new int[n];
        int one=1;int two=1;
        for(int i=0; i<n-1;i++)
        {
            int temp=one+two;
            two=one;
            one=temp;
        }
        System.out.println("The number of ways are "+one);
    }
}

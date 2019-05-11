package java2novice;
/**
 * Description:
You are given an array of numbers. Find out the array index or position
where sum of numbers preceeding the index is equals to sum of numbers
succeeding the index.
 * @author 19094
 *
 */
/****
 * Need to check with Logic
 * @author 19094
 *
 */
public class FindMiddleIndex {
	 
    public static int findMiddleIndex(int[] numbers) throws Exception {
 
        int endIndex = numbers.length - 1;
        int startIndex = 0;
        int sumLeft = 0;
        int sumRight = 0;
        while (true) {
            if (sumLeft > sumRight) {
                sumRight += numbers[endIndex--];
            } else {
                sumLeft += numbers[startIndex++];
            }
            if (startIndex >= endIndex) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
            }
        }
        return endIndex;
    }
 
    public static void main(String a[]) {
        int[] num = { 2, 17, 4, 5, 4, 1,5 };
        try {
            System.out.println("Starting from index 0, adding numbers till index "
                            + findMiddleIndex(num) + " and");
            System.out.println("adding rest of the numbers can be equal");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
package newPreperation.jan1st2020;

/**
 * Find the missing number from an array, all numbers in array are in sequence:
 * for ex. 1,2,3,5,6,7,8
 * 
 * @author 19094
 *
 */
public class MissingNumber {
	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 5, 6, 7, 8 };
		findMissing(i);
	}

	private static void findMissing(int[] i) {
		int n = i[i.length - 1];
		int currentSum = 0;
		int sum = n * (n + 1) / 2;
		int missingNum = 0;
		for (int num : i) {
			currentSum = currentSum + num;
		}
		missingNum = sum - currentSum;
		System.out.println("The missing number is: " + missingNum);
	}
}

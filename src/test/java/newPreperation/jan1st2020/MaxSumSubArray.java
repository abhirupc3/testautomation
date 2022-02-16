package newPreperation.jan1st2020;

/*
 * Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 * for ex. 1,2,5,-7,-8,9,12,13
 * max sum is: (9+12+13)= 34; this is the maximum sum of continuous  numbers
 */
public class MaxSumSubArray {
	public static void main(String[] args) {
		int i[] = { 1, 2, 5, -7, -8, 9, 12, 13 };
		findMaxSum(i);
	}

	private static void findMaxSum(int[] i) {
		int maxSum = 0;
		int maxSumEnd = 0;
		for (int num : i) {
			maxSum = maxSum + num;
			if (maxSum < 0) {
				maxSum = 0;
			}
			if (maxSumEnd < maxSum)
				maxSumEnd = maxSum;
		}
		System.out.println("The max sum is: " + maxSumEnd);
	}
}

package newPreperation.jan1st2020;
/**
 * Write a program to reverse an array:
 * for ex. I/P: {12,3,45,6,7,8,90}
 *         O/P: {90,8,7,6,45,3,12}
 * @author 19094
 *
 */
public class ArrayReversal {

	  public static void main(String[] args) {
		int arr[]= {12,3,45,6,7,8,90};
		System.out.println("Before reversal:");
		for (int i : arr) {
			System.out.print(i+",");
		}
		reverse(arr);
	}

	private static void reverse(int[] arr) {
		int startPonnter=0;
		int endPointer=(arr.length-1);
		for(int count=0;count<arr.length;count++)
		{
			int temp = arr[startPonnter];
			arr[startPonnter]=arr[endPointer];
			arr[endPointer]=temp;
			startPonnter++;
			endPointer--;
			if(startPonnter>=endPointer)
				break;
		}
		System.out.println("\nAfter reversal:");
		for (int i : arr) {
			System.out.print(i+",");
		}
	}
}

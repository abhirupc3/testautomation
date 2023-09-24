package newPreperation.datastructure;

public class BinSearch {
	static int[] arr={1,3,67,89,102,105,209};
	public static void main(String[] args) {
            binarySearch(2090);
	}

	public static void binarySearch(int key) {

		int firstIndex=0;
		int lastIndex=arr.length-1;
		int middleIndex=(firstIndex+lastIndex)/2;
		while(firstIndex<=lastIndex)
		{
			if(key<arr[middleIndex])
			{
				lastIndex=middleIndex-1;
			} else if(key>arr[middleIndex])
			{
				firstIndex=middleIndex+1;
			} 
			else if (key==arr[middleIndex])
			{
				System.out.println("Match found");
				break;
			} middleIndex=(firstIndex+lastIndex)/2;
	} if(firstIndex>lastIndex)
		System.out.println("No Match");
		}
}

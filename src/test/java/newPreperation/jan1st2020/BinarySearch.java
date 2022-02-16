package newPreperation.jan1st2020;
/**
 * Write a rogram to perform Binary Search
 * @author 19094
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		int [] i = {11,12,13,14,15,16,17,28,29};
		findElement(i,19);
		findElement(i,15);
	}

	private static void findElement(int[] i,int key) {
		int start=0;
		int end=i.length-1;
		int mid=(start+end)/2;
		boolean found=false;
		while(start<=end)
		{
			if(key<i[mid])
			{
				end=mid-1;
				mid=(start+end)/2;
			}else if(key>i[mid])
			{
				start=mid+1;
				mid=(start+end)/2;
			} else if(key==i[mid])
			{
				found=true;
				break;
			}
		}
		if(found)
		{
			System.out.println("Match Found!!");
		}else
		{
			System.out.println("No match :)");
		}
	}

}

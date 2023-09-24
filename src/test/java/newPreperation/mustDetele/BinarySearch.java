package newPreperation.mustDetele;

public class BinarySearch {
  public static void main(String[] args) {
	int i [] = {1,2,3,4,5,6,7,8,9};
	find(i,11);
}

private static void find(int[] i, int j) {
	int start=0;
	int end=i.length-1;
	int mid = (start+end)/2;
	boolean flag=false;
	while(start<=end)
	{
		if(j<i[mid])
		{
			end=mid-1;
		} else if(j>i[mid])
		{
			start=mid+1;
		} else if(j==i[mid])
		{
			System.out.println("Match Found");
			flag=true;
			break;
		}
		mid=(start+end)/2;
	}
	if(!flag)
	{
		System.out.println("No Match");
	}
}
}

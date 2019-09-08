package collection.sort;
//https://www.youtube.com/watch?v=3OJo8IKLqEQ
public class QuickSortImpl {

	
	public static void main(String[] args) {
		int [] number= {100,1,2,3,305,99,87,0,6,34,21212};
		//int [] number= {10,7,1,3,5,8,9,6};
		System.out.println("Before Sort");
		for (int i : number) {
			System.out.println(i);
		}
		int[] sortedNum = quickSort(number, 0, number.length-1);
		System.out.println("After Sort");
		for (int i : sortedNum) {
			System.out.println(i);
		}
	}
	
	public static int[] quickSort(int[] num, int start, int end)
	{
		if(start<end)
		{
			int q = getPivot(num,start,end);
			quickSort(num,start,q-1);
			quickSort(num,q+1,end);
		}
		return num;
	}
	public static int getPivot(int[] num, int start, int end)
	{
		int pivot = num[end];
		int i=start-1;
		for(int j =start;j<=end; j++)
		{
			if(num[j]<=pivot)
			{
				i=i+1;
				int temp = num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
		return i;
	}
}

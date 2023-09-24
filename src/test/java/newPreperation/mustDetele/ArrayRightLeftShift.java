package newPreperation.mustDetele;

public class ArrayRightLeftShift {

	public static void main(String[] args) {
		int i[] = {1,2,3,4,5,6,7,8,9,10,12,13};
		System.out.println("before left shift\n");
		for (int j : i) {
			System.out.print(j+",");
		}
		shift(i,2,"left");
		System.out.println("\nafter left shift\n");
		for (int j : i) {
			System.out.print(j+",");
		}
	}

	private static void shift(int[] i, int j, String shiftType) {
		int len = i.length;
		int r = j;
		if(shiftType.equalsIgnoreCase("right"))
		{
			reverse(0,len-r-1,i);
			reverse(len-r,len-1,i);
			reverse(0,len-1,i);
		} else if(shiftType.equalsIgnoreCase("left"))
		{
			reverse(0,r-1,i);
			reverse(r,len-1,i);
			reverse(0,len-1,i);
		}
		
	}

	private static void reverse(int i, int j, int[] i2) {
		while(i<=j)
		{
			int temp = i2[i];
			i2[i]=i2[j];
			i2[j]=temp;
			i++;j--;
		}
		
	}
}

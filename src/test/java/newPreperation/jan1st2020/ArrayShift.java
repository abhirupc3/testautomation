package newPreperation.jan1st2020;
/**
 * Write a program to perform right and left shifting of an array.
 * @author 19094
 *
 */
public class ArrayShift {

	static int i[] = {1,2,3,4,5,6,7,8,9,10};
	static String right="right";
	static String left="left";
	public static void main(String[] args) {
		System.out.println("Original array is:");
		for (int num : i) {
			System.out.print(num+",");
		}
		shift("left",1);
	}
	private static void shift(String type, int j) {
		if(j<=0 || j >=i.length)
		{
			System.out.println("\nout of range");
			return;
		}
		if(type.equalsIgnoreCase(right))
		{
			j=j+1;
			reverse(i,0,i.length-j);
			reverse(i,(i.length-j)+1,i.length-1);
			reverse(i,0,i.length-1);
			System.out.println("\nThe right shifted array is: ");
			for (int num : i) {
				System.out.print(num+",");
			}
		} else if(type.equalsIgnoreCase(left))
		{
			j=j-1;
			reverse(i,0,j);
			reverse(i,j+1,i.length-1);
			reverse(i,0,i.length-1);
			System.out.println("\nThe left shifted array is: ");
			for (int num : i) {
				System.out.print(num+",");
			}
		}
	}
	private static int[] reverse(int[] i,int startInd,int endInd)
	{
		while(startInd<=endInd) {
			int temp=i[startInd];
			i[startInd]=i[endInd];
			i[endInd]=temp;
			startInd=startInd+1;
			endInd=endInd-1;
		}
		return i;
	}
}

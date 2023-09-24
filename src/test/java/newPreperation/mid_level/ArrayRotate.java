package newPreperation.mid_level;
import java.util.Arrays;
public class ArrayRotate {
 
    // main method
    public static void main(String[] args)
    {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Before left rotate");
        print(array);
        System.out.println("After left rotate");
        rotateLeft(array, 3);
        print(array);
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };//7,6,5,1,2,3,4
        System.out.println("After left rotate");
        print(array1);
        System.out.println("After left rotate");
        rotateRight(array1, 3);
        print(array1);
    }
    static int counter1;
    static int counter2=0;
 
    // rotate method
    private static void rotateLeft(int[] array, int n)
    {
    	counter1=n;
    	int temp=0;
    	for(int p=0;p<array.length-n;p++)
    	{
    		temp=array[counter2];
    		array[counter2]=array[counter1];
    		array[counter1]=temp;
    		counter2++;
    		counter1++;
    	}
    	
    	}
    
    private static void rotateRight(int[] array, int n)
    {
    	counter1=array.length-n;
    	counter2=array.length-1;
    	int temp=0;
    	int [] ij = new int[12];
    	for(int p:ij)
    	{
    		System.out.println(p);
    	}
    	System.out.println("Length:  "+ij.length);
    	for(int p=0;p<array.length-n;p++)
    	{
    		temp=array[counter2];
    		array[counter2]=array[counter1];
    		array[counter1]=temp;
    		counter2--;
    		counter1--;
    	}
    	
    	}
 
    // method to print the array
    private static void print(int[] array)
    {
    	System.out.println("End of new Index");
    	for(int y:array)
    	{
    		System.out.print("["+y+"] ");
    	}
       // Arrays.stream(array).forEach(a -> System.out.print(a + " "));
    }
}
package newPreperation.jan1st2020.basics;
/**
 * Write a program to find the GCD in an array;
 * for ex. input {1,2,3,4,5,6}
 * out put 1
 * @author 19094
 *
 */
public class FindGCD {

	public static void main(String[] args) {
		int nums[] = {18,4};
		int num1=nums[0];
		int j=0;
		for (int i=1;i<nums.length;i++)
		{
			j=findGCD(num1,nums[i]);
		}
		System.out.println(j);
	}

	private static int findGCD(int num1, int num2) {
		if(num1==0)
		{
		return	num2;
		}
		return findGCD(num2%num1,num1);
	}
}

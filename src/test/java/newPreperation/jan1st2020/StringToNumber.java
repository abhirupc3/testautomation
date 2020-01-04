package newPreperation.jan1st2020;
/**
 * Verify if the given string is a number, and if it is a number then convert it to String
 * Ex. "123"  Algorithm: 1*10 pow 2+ 2* 10 pow 1 +3 * 10 pow 0;
 */
import java.util.ArrayList;

public class StringToNumber {
  public static String num =  "-1A024";
  public static void main(String[] args) {
	char[] c = num.toCharArray();
	int intNum=0;
	for (int i = 0; i<c.length;i++) {
		int x = c[i];
		if(!isNum(x))
		{
			System.out.println("Entered value is not a number");
			return;
		}
		intNum =intNum+ (int) (Character.getNumericValue(c[i])*Math.pow(10,(c.length-1)-i));
	}
	if(intNum<0)
		intNum = (int) ((Math.pow(10, c.length-1))+intNum)*(-1);
	System.out.println("The Strng value is: ");
	System.out.println(intNum);
}
   public static boolean isNum(int num)
   {
	   ArrayList<Integer> n = new ArrayList<Integer>();
	   for(int i=48;i<58;i++)
	   {
		   n.add(i);
	   }
	   n.add(45);
	   return n.contains(num);
   }
}

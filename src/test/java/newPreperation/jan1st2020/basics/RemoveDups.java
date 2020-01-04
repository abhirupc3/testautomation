package newPreperation.jan1st2020.basics;

import java.util.ArrayList;

/**
 * Write a program to remove all the duplicate characters inside a String
 * for ex. input : Hello
 *         output: Helo 
 * @author 19094
 *
 */
public class RemoveDups {
 public static void main(String[] args) {
	String input = "Hello";
	String outPut="";
	ArrayList<Character> arrList = new ArrayList<Character>();
	for(int i=0;i<input.length();i++)
	{
		char c = input.charAt(i);
		if(!arrList.contains(c))
		{
			arrList.add(c);
			outPut=outPut+String.valueOf(c);
		}
			
	}
	System.out.println("Input: "+input);
	System.out.println("Output: "+outPut);
		
}
}

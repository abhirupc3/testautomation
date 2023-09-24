package newPreperation.jan1st2020;

import java.util.ArrayList;

/**
 * Write a program to find if the numbers are anagram for ex. input 1: act and
 * input 2: cat output anagram input 1 act and input 2 cata output not anagram
 * 
 * @author 19094
 *
 */
public class AnagramCheck {
	public static void main(String[] args) {
		String input1 = "act";
		String input2 = "act";
		isAnagram(input1, input2);
	}

	private static void isAnagram(String input1, String input2) {
		ArrayList<Character> inputList = new ArrayList<Character>(); 
		boolean isAnagram=true;
		if(input1==null || input2==null)
		{
			System.out.println("Invalid input");
			return;
		}
		else if(input1.length()!=input2.length())
		{
			System.out.println("not anagrm");
			return;
		}
		char [] inputArray1 = input1.toCharArray();
		for (char c : inputArray1) {
			inputList.add(c);
		}
		char [] inputArray2 = input2.toCharArray();
		for (char c : inputArray2) {
			if(inputList.contains(c))
			{
				inputList.remove(inputList.indexOf(c));
			}else {
				System.out.println("not anagrm");
				isAnagram=false;
				return;
			}
		}
		if(isAnagram)
			System.out.println("The strings are Anagram");
	}
}

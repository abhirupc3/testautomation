package newPreperation.mustDetele;

import java.util.ArrayList;
import java.util.List;

public class AnagramCheck {

	public static void main(String[] args) {
		String st1 = "bat";
		String st2 = "cat";
		checkAnagram(st1,st2);
		List<Character> inputList = new ArrayList<Character>();
		inputList.add('a');
		inputList.add('b');
		System.out.println(inputList);
		inputList.remove(Character.valueOf('a'));
		System.out.println(inputList);
	}

	private static void checkAnagram(String st1, String st2) {
		if(st1.length()!=st2.length())
		{
			System.out.println("Not anagram");
			return;
		}
		char[] c1 = st1.toCharArray();
		char[] c2 = st2.toCharArray();
		List<String> inputList = new ArrayList<String>();
		for (char c : c1) {
			inputList.add(String.valueOf(c));
		}
		for (char c : c2) {
			if(!inputList.contains(String.valueOf(c)))
			{
				System.out.println("Not Anagram");
				return;
			} else {
				inputList.remove(String.valueOf(c));
			}
		}
		System.out.println("Both strings are anagram");
	}
}

package newPreperation.jan1st2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Write a program to perform sorting using comparable
 * @author 19094
 *
 */
public class StudentComparable implements Comparable<StudentComparable> {

	public String name;
	public int grade;
	public StudentComparable(String name, int grade)
	{
		this.name=name;
		this.grade=grade;
	}
	public int compareTo(StudentComparable o) {
		return this.name.compareTo(o.name);
	}

	public static void main(String[] args) {
		List<StudentComparable> stList = new ArrayList<StudentComparable>();
		stList.add(new StudentComparable("A",1));
		stList.add(new StudentComparable("B",2));
		stList.add(new StudentComparable("Z",3));
		stList.add(new StudentComparable("W",4));
		stList.add(new StudentComparable("C",5));
		System.out.println("Before sort:");
		printList(stList);
		Collections.sort(stList);
		System.out.println("After sort:");
		printList(stList);
		//** Array sorting
		StudentComparable [] stArray = new StudentComparable[5];
		stArray[0]=new StudentComparable("A",1);
		stArray[1]=new StudentComparable("B",2);
		stArray[2]=new StudentComparable("Z",3);
		stArray[3]=new StudentComparable("W",4);
		stArray[4]=new StudentComparable("C",5);
		Arrays.sort(stArray,Collections.reverseOrder());
		System.out.println("After sort in reverse order");
		printList(stArray);
	}
	private static void printList(List<StudentComparable> st)
	{
		
		for (StudentComparable student : st) {
			System.out.println(student.name+"   "+student.grade);
		}
	}
	private static void printList(StudentComparable[] st)
	{
		
		for (StudentComparable student : st) {
			System.out.println(student.name+"   "+student.grade);
		}
	}
}

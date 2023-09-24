package newPreperation.jan1st2020.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import newPreperation.jan1st2020.StudentComparable;

public class StudentImpl {
 public static void main(String[] args) {
	List<StudentData> stList = new ArrayList<StudentData>();
	stList.add(new StudentData("A",5));
	stList.add(new StudentData("B",9));
	stList.add(new StudentData("Z",3));
	stList.add(new StudentData("W",4));
	stList.add(new StudentData("C",8));
	System.out.println("Before Sort");
	printList(stList);
	Collections.sort(stList,new NameComparator());
	System.out.println("After Sort");
	printList(stList);
	System.out.println("Before Sort");
	printList(stList);
	Collections.sort(stList,new GradeComparator());
	System.out.println("After Sort");
	printList(stList);
	Collections.sort(stList,Collections.reverseOrder(new GradeComparator()));
	System.out.println("After reverse Sort");
	printList(stList);
}
 public static void printList(List<StudentData> stData)
 {
	 for (StudentData studentData : stData) {
		System.out.println(studentData.name +"  "+ studentData.grade);
	}
 }
}

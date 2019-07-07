package newPreperation.sort.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparatorExample {

	public static void main(String args[]) {
		List<Student> stList = new ArrayList<Student>();
		
		Student student[] = new Student[3];

		student[0] = new Student();
		student[0].setName("Nick");
		student[0].setGrade(19);

		student[1] = new Student();
		student[1].setName("Helen");
		student[1].setGrade(12);

		student[2] = new Student();
		student[2].setName("Ross");
		student[2].setGrade(16);
		stList.add(student[0]);
		stList.add(student[1]);
		stList.add(student[2]);
		System.out.println("Order of students before sorting is: ");

		for (Student s : student) {
			System.out.println(s.getName() + "\t"
					+ s.getGrade());
		}

		Arrays.sort(student, new GradeComparator());
		Collections.sort(stList, new GradeComparator());
		System.out
				.println("Order of students after sorting by student grade is");

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "\t"
					+ student[i].getGrade());
		}
		//Arrays.sort(student,new NameComparator());
       Collections.sort(Arrays.asList(student),new NameComparator());
		/*Arrays.sort(student,new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getGrade() - o2.getGrade();
			}
		});*/
		System.out
				.println("Order of students after sorting by student name is");

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "\t"
					+ student[i].getGrade());
		}
	}

}
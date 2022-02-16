package newPreperation.jan1st2020.comparator;

import java.util.Comparator;

public class GradeComparator implements Comparator<StudentData> {
	public int compare(StudentData o1, StudentData o2) {
		int res = o1.grade.compareTo(o2.grade);
		return res;
	}

}

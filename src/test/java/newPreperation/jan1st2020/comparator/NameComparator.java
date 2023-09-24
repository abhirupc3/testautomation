package newPreperation.jan1st2020.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentData>{

	public int compare(StudentData o1, StudentData o2) {
		int res = o1.name.compareTo(o2.name);
		return res;
	}

}

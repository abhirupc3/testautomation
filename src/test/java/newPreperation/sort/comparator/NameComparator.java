package newPreperation.sort.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		// descending order (ascending order would be:
        // o1.getGrade()-o2.getGrade())
		 return o1.getName().compareTo(o2.getName());
	}


}

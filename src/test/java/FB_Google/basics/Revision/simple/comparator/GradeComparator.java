package FB_Google.basics.Revision.simple.comparator;

import java.util.Comparator;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class GradeComparator implements Comparator<Student> {



    public int compare(Student s1, Student s2)
    {
       return s1.name.compareTo(s2.name);
    }
}

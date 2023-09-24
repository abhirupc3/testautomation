package FB_Google.basics.Revision.simple.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class StudentImpl {
    public static void main(String[] args) {
        List<Student> li = new ArrayList<Student>();

        li.add(new Student(89));
        li.add(new Student(102));
        li.add(new Student(12));
        System.out.println("Before Sort: ");
        for(Student st:li)
        {
            System.out.println(st.score);
        }
        Collections.sort(li);
        System.out.println("After Sort: ");
        for(Student st:li)
        {
            System.out.println(st.score);
        }
    }
}

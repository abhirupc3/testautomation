package FB_Google.basics.Revision.simple.comparator;

import java.util.Arrays;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class StudentImpl {
    public static void main(String[] args) {
        Student [] st = new Student[2];
        st[0]= new Student("Chatterjee", 79);
        st[1] = new Student("AbhirupC", 82);
        System.out.println("Before Sort");
        for(int k=0;k<st.length;k++)
        {
            System.out.println(st[k].name);
        }
        Arrays.sort(st, new GradeComparator());
        System.out.println("After Sort");
        for(int k=0;k<st.length;k++)
        {
            System.out.println(st[k].name);
        }
    }
}

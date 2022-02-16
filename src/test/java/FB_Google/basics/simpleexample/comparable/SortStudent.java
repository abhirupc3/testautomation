package FB_Google.basics.simpleexample.comparable;

import java.util.*;

/**
 * @author achatterjee ON 2/2/22
 * @project testautomation
 */
public class SortStudent {

    public static void main(String[] args) {
        Student[] st = new Student[3];
        st[0] = new Student("Rup",1);
        st[1] = new Student("CHa",2);
        st[2] = new Student("Abhi",4);
        printStudent(st);
        Collections.sort(Arrays.asList(st));
        System.out.println("After the Sort happened");
        printStudent(st);


        System.out.println("\n\n\n\n\nBefore sort\n\n\n\n\n");

        List<Student> stList = new ArrayList<Student>();
        stList.add(new Student("D",4));
        stList.add(new Student("C",3));
        stList.add(new Student("B",2));
        stList.add(new Student("A",1));
        printStudentFromList(stList);
        System.out.println("\n\n\n\n\nAfter sort\n\n\n\n\n");
        Collections.sort(stList);
        printStudentFromList(stList);
    }

    public static void printStudent(Student[] st)
    {
        for(Student s:st)
        {
            System.out.println("Name: "+s.name);
        }
    }

    public static void printStudentFromList(List<Student> st)
    {
        for(Student s:st)
        {
            System.out.println("Name: "+s.name);
        }
    }
}

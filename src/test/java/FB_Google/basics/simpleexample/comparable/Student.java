package FB_Google.basics.simpleexample.comparable;

/**
 * @author achatterjee ON 2/2/22
 * @project testautomation
 */
public class Student implements Comparable<Student> {
    String name;
    int grade;
     public Student(String name, int grade)
     {
         this.name=name;
         this.grade=grade;
     }


    public int compareTo(Student student)
    {
       return this.name.compareTo(student.name);
    }

}

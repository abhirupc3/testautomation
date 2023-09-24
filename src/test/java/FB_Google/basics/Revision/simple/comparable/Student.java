package FB_Google.basics.Revision.simple.comparable;

/**
 * @author achatterjee ON 3/11/22
 * @project testautomation
 */
public class Student implements Comparable<Student>{
    int score;
    public Student(int score)
    {
        this.score = score;
    }
    public int compareTo(Student s)
    {
        return this.score-s.score;
    }
}

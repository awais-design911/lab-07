import java.util.Comparator;

/** External ordering: descending by CGPA. */
public class CgpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getCgpa(), a.getCgpa());
    }
}

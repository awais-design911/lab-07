import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, 3.20));
        students.add(new Student(101, 3.85));
        students.add(new Student(102, 3.55));

        System.out.println("Original list:");
        students.forEach(System.out::println);

        Collections.sort(students);   // uses Comparable (rollNo ascending)
        System.out.println("\nSorted by rollNo (Comparable, ascending):");
        students.forEach(System.out::println);

        students.sort(new CgpaComparator());   // uses Comparator (cgpa descending)
        System.out.println("\nSorted by CGPA (Comparator, descending):");
        students.forEach(System.out::println);
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorted {
    public static void main(String[] args) {
        ArrayList<Student>  students = new ArrayList<>();
        students.add(new Student(101, "John", 3));
        students.add(new Student(104, "Anil", 4));
        students.add(new Student(102, "Smith", 2));
        students.add(new Student(103, "Robert", 1));

        Collections.sort(students);
         //Collections.reverse(students);

        for (Student s : students){
            System.out.println(s);
        }
    }
}

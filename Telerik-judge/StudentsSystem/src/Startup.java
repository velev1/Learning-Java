import java.util.ArrayList;
import java.util.Collections;

public class Startup {
    public static void main(String[] args) {

        Student s1 = new Student("Gosho", 2, "sp1", 1, 2d);
        Student s2 = new Student("Gosho", 2, "sp3", 1, 6d);
        Student s3 = new Student("Gosho", 2, "sp3", 1, 2d);
        Student s4 = new Student("Gosho", 2, "sp1", 1, 1d);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for (Student st: students) {
            System.out.println(st.toString());
        }

        Collections.sort(students);
        System.out.println("============================");
        for (Student st: students) {
            System.out.println(st.toString());
        }
    }
}

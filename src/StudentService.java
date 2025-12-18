import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void deleteStudent(int id) {
        Student toRemove = null;

        for (Student s : students) {
            if (s.getId() == id) {
                toRemove = s;
                break;
            }
        }

        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }
}

import java.util.ArrayList;
import java.io.*;

public class StudentService {

    private final ArrayList<Student> students = new ArrayList<>();
    private final String FILE_NAME = "students.txt";

    public StudentService() {
        loadStudentsFromFile();
    }

    // ================= ADD STUDENT =================
    public void addStudent(Student student) {
        students.add(student);
        saveStudentToFile(student);
        System.out.println("Student added successfully.");
    }

    // ================= LIST STUDENTS =================
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    // ================= DELETE STUDENT =================
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
            rewriteFile();
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // ================= FILE METHODS =================

    private void saveStudentToFile(Student student) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(
                    student.getId() + "," +
                            student.getName() + "," +
                            student.getGpa() + "\n"
            );
        } catch (IOException e) {
            System.out.println("Error saving student to file.");
        }
    }

    private void loadStudentsFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double gpa = Double.parseDouble(data[2]);

                students.add(new Student(id, name, gpa));
            }
        } catch (IOException e) {
            System.out.println("Error loading students from file.");
        }
    }

    private void rewriteFile() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (Student s : students) {
                writer.write(
                        s.getId() + "," +
                                s.getName() + "," +
                                s.getGpa() + "\n"
                );
            }
        } catch (IOException e) {
            System.out.println("Error updating file.");
        }
    }
}

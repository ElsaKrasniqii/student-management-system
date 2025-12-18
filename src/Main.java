import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();

                    service.addStudent(new Student(id, name, gpa));
                    break;

                case 2:
                    service.listStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    service.deleteStudent(deleteId);
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

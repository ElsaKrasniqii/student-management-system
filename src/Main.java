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

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter GPA: ");
                        double gpa = Double.parseDouble(scanner.nextLine());

                        service.addStudent(new Student(id, name, gpa));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please try again.");
                    }
                    break;

                case 2:
                    service.listStudents();
                    break;

                case 3:
                    try {
                        System.out.print("Enter ID to delete: ");
                        int deleteId = Integer.parseInt(scanner.nextLine());
                        service.deleteStudent(deleteId);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                    }
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

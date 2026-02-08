import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add student");
            System.out.println("2. View students");
            System.out.println("3. Search student");
            System.out.println("4. Remove student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();
                    
                    System.out.print("Enter average mark: ");
                    double mark;
                    try {
                        mark = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Mark should be a number.");
                        break;
                    }

                    Student newStudent = new Student(id, name, course, mark);
                    manager.addStudent(newStudent);
                    System.out.println("✅ Student added successfully.");
                    break;

                case "2":
                    System.out.println("\n📋 List of Students:");
                    for (Student student : manager.getAllStudents()) {
                        System.out.println(student.toString());
                    }
                    break;

                case "3":
                    System.out.print("Enter student ID to search: ");
                    String searchId = scanner.nextLine();
                    Student found = manager.findStudentById(searchId);
                    if (found != null) {
                        System.out.println("Student found: " + found);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "4":
                    System.out.print("Enter student ID to remove: ");
                    String removeId = scanner.nextLine();
                    boolean removed = manager.removeStudentById(removeId);
                    if (removed) {
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "5":
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
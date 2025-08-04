package practical.practice_2;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int index = 0;

        while (true) {
            System.out.println("\n🎓 === Student Record Menu ===");
            System.out.println("1. Register Student");
            System.out.println("2. Register Scholarship Student");
            System.out.println("3. Show Student Count");
            System.out.println("4. Show Payable Fees (for Scholars)");
            System.out.println("5. Export Student as CSV");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("\n--- Register Student ---");
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Roll No: ");
                    String roll = sc.nextLine();
                    System.out.print("CGPA: ");
                    float cgpa = sc.nextFloat(); sc.nextLine();
                    Address addr = readAddress(sc);
                    students[index++] = new Student(name, email, roll, cgpa, addr);
                    break;
                }

                case 2: {
                    System.out.println("\n--- Register Scholarship Student ---");
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Roll No: ");
                    String roll = sc.nextLine();
                    System.out.print("CGPA: ");
                    float cgpa = sc.nextFloat(); sc.nextLine();
                    Address addr = readAddress(sc);
                    System.out.print("Scholarship Amount: ");
                    float scholarship = sc.nextFloat(); sc.nextLine();
                    students[index++] = new ScholarshipStudent(name, email, roll, cgpa, addr, scholarship);
                    break;
                }

                case 3: {
                    System.out.println("📊 Total Students Registered: " + Student.getStudentCount());
                    break;
                }

                case 4: {
                    System.out.print("Enter student index (0 to " + (index - 1) + "): ");
                    int i = sc.nextInt(); sc.nextLine();
                    if (students[i] instanceof ScholarshipStudent s) {
                        System.out.print("Enter Total Fees: ");
                        float fees = sc.nextFloat(); sc.nextLine();
                        System.out.println("Payable Fees: ₹" + s.getPayableFees(fees));
                    } else {
                        System.out.println("❌ Not a Scholarship Student!");
                    }
                    break;
                }

                case 5: {
                    for (int i = 0; i < index; i++) {
                        System.out.println(students[i].toCSV());
                    }
                    break;
                }

                case 6: {
                    System.out.println("👋 Exiting System.");
                    return;
                }

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static Address readAddress(Scanner sc) {
        System.out.println("--- Address Details ---");
        System.out.print("Door No: ");
        String door = sc.nextLine();
        System.out.print("Street: ");
        String street = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("Pincode: ");
        String pin = sc.nextLine();
        return new Address(door, street, city, pin);
    }
}

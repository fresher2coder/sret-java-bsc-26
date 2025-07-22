package practical.practice_1;


public class EmployeeTester {

    public static void main(String[] args) {

        // Display Company Name
        System.out.println(Employee.companyName);

        // Create Employees
        Employee e1 = new Employee("Ram", "ram@gmail.com", 9876543210L, 30000.0f, new String[]{"Java", "Spring"});
        System.out.println("Employee Info: " + e1);

        Employee e2 = new Employee("Sita", "sita@gmail.com", 9876500000L, 35000.0f, new String[]{"UI/UX", "Figma", "HTML"});
        System.out.println("Employee Info: " + e2);

        // Display Full Details
        e1.displayDetails();
        e2.displayDetails();
    }
}


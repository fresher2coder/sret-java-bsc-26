package practical.practice_1;

import java.util.Arrays;

public class Employee {

    // Static Members
    static String companyName;
    static int empCounter;

    // Static Block
    static {
        companyName = "TCS";
        empCounter = 1000;
        System.out.println("Welcome to " + companyName);
    }

    // Instance Members
    int empId;
    String name;
    String email;
    long phone;
    float basicSalary;
    String[] skills;

    // Default Constructor
    public Employee() {
        System.out.println("New employee registered.");
    }

    // Parameterized Constructor
    public Employee(String name, String email, long phone, float basicSalary, String[] skills) {
        this(); // Call default constructor
        this.empId = ++empCounter;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.basicSalary = basicSalary;
        this.skills = skills;
    }

    // Method: Calculate Gross Salary
    public float calculateSalary() {
        return basicSalary + (0.2f * basicSalary);
    }

    // Method: Display Employee Details
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Skills: " + String.join(", ", skills));
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("Gross Salary: ₹" + calculateSalary());
    }

    // Overriding toString
    @Override
    public String toString() {
        return "Employee [company=" + companyName + ", empId=" + empId + ", name=" + name + ", email=" + email + "]";
    }
}


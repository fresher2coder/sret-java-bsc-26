package practical.practice_2;

public class Student extends Person {
    private String rollNo;
    private float cgpa;
    protected String name, email;
    protected Address address;
    static int studentCount;

    static {
        studentCount = 0;
        System.out.println("📘 Student class loaded");
    }

    public Student() {
        System.out.println("Default Student constructor");
        studentCount++;
    }

    public Student(String name, String email, String rollNo, float cgpa, Address address) {
        this(); // constructor chaining
        this.name = name;
        this.email = validateEmail(email);
        this.rollNo = rollNo;
        this.cgpa = validateCgpa(cgpa);
        this.address = address;
    }

    private String validateEmail(String email) {
        return (email.contains("@")) ? email : "invalid@email.com";
    }

    private float validateCgpa(float cgpa) {
        return (cgpa >= 0.0 && cgpa <= 10.0) ? cgpa : 0.0f;
    }

    public String getMaskedRoll() {
        return "ROLL-XXX" + rollNo.charAt(rollNo.length() - 1);
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public String toCSV() {
        return rollNo + "," + name + "," + email + "," + cgpa + "," + address.getShortAddress();
    }

    public void printWelcome() {
        System.out.println("Welcome, Student: " + name);
    }

    public String getRollNo() {
        return rollNo;
    }

    public float getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", cgpa=" + cgpa +
                ", address=" + address.getShortAddress() +
                '}';
    }
}

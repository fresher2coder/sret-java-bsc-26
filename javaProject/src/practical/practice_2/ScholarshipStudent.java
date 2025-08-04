package practical.practice_2;

//ScholarshipStudent.java
public class ScholarshipStudent extends Student {
 private float scholarshipAmount;

 public ScholarshipStudent(String name, String email, String rollNo, float cgpa, Address addr, float scholarshipAmount) {
     super(name, email, rollNo, cgpa, addr);
     this.scholarshipAmount = scholarshipAmount;
 }

 @Override
 public void printWelcome() {
     System.out.println("Welcome Scholar with CGPA " + getCgpa() + "!");
 }

 public float getPayableFees(float totalFees) {
     if (getCgpa() >= 9) return totalFees - 30000;
     else if (getCgpa() >= 8) return totalFees - 20000;
     else return totalFees - 10000;
 }
}

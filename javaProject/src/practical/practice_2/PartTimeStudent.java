package practical.practice_2;

public class PartTimeStudent extends Student {
    private int workHours;
    private float stipendPerHour;

    public PartTimeStudent(String name, String email, String rollNo, float cgpa, Address addr, int hours, float stipend) {
        super(name, email, rollNo, cgpa, addr);
        this.workHours = hours;
        this.stipendPerHour = stipend;
    }

    public float calculateMonthlyStipend() {
        return workHours * stipendPerHour * 4; // 4 weeks approx
    }

    @Override
    public void printWelcome() {
        System.out.println("Welcome Working Student – " + workHours + "hrs/week");
    }
}

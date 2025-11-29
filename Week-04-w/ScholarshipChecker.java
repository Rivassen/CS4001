import java.util.Scanner;

public class ScholarshipChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double gpa;
        double attendance;
        int attitude;

        System.out.print("Enter GPA: ");
        gpa = sc.nextDouble();

        System.out.print("Enter attendance percentage: ");
        attendance = sc.nextDouble();

        System.out.print("Enter attitude score (1–10): ");
        attitude = sc.nextInt();

        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("The student is eligible for a scholarship.");
                } else {
                    System.out.println("Not eligible: Attitude score must be less than 5.");
                }
            } else {
                System.out.println("Not eligible: Attendance must be more than 80%.");
            }
        } else {
            System.out.println("Not eligible: GPA must be at least 3.2.");
        }
    }
}

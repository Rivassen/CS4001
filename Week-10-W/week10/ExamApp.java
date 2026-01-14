package week10;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp {
    public static void main(String[] args) {
        ScienceStudent ss = new ScienceStudent(1, "Yogi", 45.0, "Physics");
        ManagementStudent ms = new ManagementStudent(2, "Soren", 38.0, "Finance");

        System.out.println("Science Student Details");
        System.out.println(ss.toString());
        System.out.println("Result: " + ss.calculateResult());
        System.out.println("Result with 5 grace marks: " + ss.calculateResult(5));

        System.out.println("\n Management Student Details");
        System.out.println(ms.toString());
        System.out.println("Result: " + ms.calculateResult());
        System.out.println("Result with 3 grace marks: " + ms.calculateResult(3));
    }
}
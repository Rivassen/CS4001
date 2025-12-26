
/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    int subject1;
    int subject2;
    int subject3;

    int calculateTotal()
    {
        return subject1 + subject2 + subject3;
    }

    double calculatePercentage()
    {
        return (calculateTotal() / 300.0) * 100;
    }

    void displayResult()
    {
        System.out.println("Marks : " + subject1 + ", " + subject2 + ", " + subject3);
        System.out.println("Total : " + calculateTotal());
        System.out.println("Percentage : " + calculatePercentage() + "%");
    }
}

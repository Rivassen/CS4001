
/**
 * Write a description of class StudentScores here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
        int[] a = {10, 20, 30, 40, 50};

        int sum = 0;
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
            sum = sum + a[i];

            if (a[i] > max)
                max = a[i];

            if (a[i] < min)
                min = a[i];
        }

        double avg = (double) sum / a.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Highest = " + max);
        System.out.println("Lowest = " + min);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] b = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter score: ");
            b[i] = sc.nextInt();
        }

        System.out.println("Updated array:");
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
    }
}


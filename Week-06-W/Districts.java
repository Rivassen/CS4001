
/**
 * Write a description of class Districts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Districts
{
    public static void main(String[] arg)
    {
        String[] d = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};

        for (int i = 0; i < d.length; i++)
        {
            System.out.println((i + 1) + ". " + d[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of districts: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] d2 = new String[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter district name: ");
            d2[i] = sc.nextLine();
        }

        System.out.println("Updated districts:");
        for (int i = 0; i < d2.length; i++)
        {
            System.out.println((i + 1) + ". " + d2[i]);
        }
    }
}

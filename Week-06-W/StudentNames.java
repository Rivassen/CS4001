
/**
 * Write a description of class StudentName here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class StudentNames
{
    public static void main(String[] args)
    {
        String[] names = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};

        System.out.println("Student Names:");
        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }

        System.out.println("\nName at index 2: " + names[2]);

        names[4] = "Amit";
        System.out.println("Updated name at index 4: " + names[4]);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a new name to update index 1: ");
        names[1] = sc.nextLine();

        System.out.println("\nUpdated Student Names:");
        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}

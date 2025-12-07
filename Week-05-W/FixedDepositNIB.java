
/**
 * Write a description of class Scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class FixedDepositNIB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double feeRate = 0.005;
        char again = 'y';

        while (again == 'y' || again == 'Y') {

            System.out.print("Enter principal (minimum 1000): ");
            double P = sc.nextDouble();

            System.out.print("Enter annual interest rate (8–12): ");
            double annualRate = sc.nextDouble();

            System.out.print("Enter duration in years (max 5): ");
            int years = sc.nextInt();

            double monthlyRate = annualRate / 100 / 12;
            int months = years * 12;

            double A = P * Math.pow(1 + monthlyRate, months);

            double fee = A * feeRate;

            double finalAmount = A - fee;

            System.out.println("\n--- Result ---");
            System.out.println("Maturity Amount (before fee): " + A);
            System.out.println("Processing Fee: " + fee);
            System.out.println("Final Amount: " + finalAmount);

            System.out.print("\nDo another calculation? (y/n): ");
            again = sc.next().charAt(0);
        }

        System.out.println("Done.");
    }
}

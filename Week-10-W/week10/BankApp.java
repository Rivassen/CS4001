package week10;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("S123", "Yogi", 10000.0);
        CurrentAccount ca = new CurrentAccount("C456", "Soren", -500.0); 

        System.out.println("Savings Account Details");
        System.out.println(sa.toString());
        System.out.println("Annual Interest (Default Rate): " + sa.calculateInterest());
        System.out.println("Annual Interest (Custom Rate 4%): " + sa.calculateInterest(0.04));

        System.out.println("\n--- Current Account Details ---");
        System.out.println(ca.toString());
        System.out.println("Annual Interest: " + ca.calculateInterest());
        System.out.println("Overdraft Fee (Rate 10%): " + ca.calculateInterest(0.10));
    }
}
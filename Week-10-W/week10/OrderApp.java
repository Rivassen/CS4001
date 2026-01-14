package week10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp {

    public static void main(String[] args) {
        
        NormalOrder normalOrder = new NormalOrder(
                101,
                "John Doe",
                5000
        );

        PremiumOrder premiumOrder = new PremiumOrder(
                102,
                "Alice Smith",
                8000,
                500
        );

        System.out.println("=== NORMAL ORDER INVOICE ===");
        System.out.println(normalOrder);
        System.out.println("Final Amount: " + normalOrder.calculateFinalAmount());

        System.out.println("\n=== PREMIUM ORDER INVOICE ===");
        System.out.println(premiumOrder);
        System.out.println("Final Amount (No Discount): " + premiumOrder.calculateFinalAmount());
        System.out.println("Final Amount (With Discount): " +
                premiumOrder.calculateFinalAmount(1000));
    }
}

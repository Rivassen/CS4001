package week10;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends Order {

    private double serviceCharge;

    public PremiumOrder(int orderId, String customerName, double amount, double serviceCharge) {
        super(orderId, customerName, amount);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount() + serviceCharge;
    }

    public double calculateFinalAmount(double discountAmount) {
        return super.calculateFinalAmount(discountAmount) + serviceCharge;
    }
}

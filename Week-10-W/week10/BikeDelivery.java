package week10;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends DeliveryPartner
{
    private static final double Bike_Bonus = 50.0;
    private static final double Per_Extra_Order_Rate= 10.0;
    
    public BikeDelivery(String partnerID, String name, double basePay){
        super(partnerID, name, basePay);
    }
    
    @Override
    public double calculatePayment(){
        return super.calculatePayment() + Bike_Bonus;
    }
    
    public double calculatePayment(int extraOrders){
        return calculatePayment() + (extraOrders * Per_Extra_Order_Rate);
    }
    
    @Override
    public String toString(){
        return"BikeDelivery" + super.toString() + ",Total Payment: " + 
        calculatePayment();
    }
}
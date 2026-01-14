package week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp {
    public static void main(String[] args) {
        BikeDelivery bikePartner = new BikeDelivery("B1", "Yogi", 200.0);
        CarDelivery carPartner = new CarDelivery("C1", "Soren", 250.0);

        System.out.println("Bike Partner Details");
        System.out.println(bikePartner.toString());
        System.out.println("Payment with 3 extra orders: " + bikePartner.calculatePayment(3));

        System.out.println("\nCar Partner Details");
        System.out.println(carPartner.toString());
        System.out.println("Payment with 5 extra orders: " + carPartner.calculatePayment(5));
    }
}
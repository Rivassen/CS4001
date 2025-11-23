import java.util.Scanner;

public class RickshawFare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double baseFare = 30.0;         
        double perKm = 15.0;           
        double perMinute = 2.0;          
        double longDistDiscount = 0.10;  
        double nightSurcharge = 0.20;    

        System.out.print("Enter distance travelled (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter travel time (minutes): ");
        double minutes = sc.nextDouble();

        System.out.print("Is the customer a local? (yes/no): ");
        String localInput = sc.next().trim().toLowerCase();
        boolean isLocal = localInput.equals("yes") ? true : false; 

        System.out.print("Is it night-time travel? (yes/no): ");
        String nightInput = sc.next().trim().toLowerCase();
        boolean isNight = nightInput.equals("yes") ? true : false; 

        double fare = baseFare + (distance * perKm) + (minutes * perMinute);

        fare = (isLocal && distance > 10) ? fare - (fare * longDistDiscount) : fare;

        fare = isNight ? fare + (fare * nightSurcharge) : fare;

        System.out.println("----------------------------------");
        System.out.println("Final Rickshaw Fare: Rs. " + Math.round(fare));
        System.out.println("----------------------------------");
    }
}

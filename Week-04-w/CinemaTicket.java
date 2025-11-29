import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Age Group:");
        System.out.println("1. Child");
        System.out.println("2. Adult");
        System.out.println("3. Senior");
        System.out.print("Enter choice (1-3): ");
        int ageChoice = sc.nextInt();

        double price = 0;

        switch (ageChoice) {
            case 1:
                price = 150;
                break;
            case 2:
                price = 250;
                break;
            case 3:
                price = 200;
                break;
            default:
                System.out.println("Invalid age group!");
                sc.close();
                return;
        }

        System.out.println("\nSelect Movie Language:");
        System.out.println("1. Nepali");
        System.out.println("2. Hindi  (+ Rs. 50)");
        System.out.println("3. English (+ Rs. 100)");
        System.out.print("Enter choice (1-3): ");
        int langChoice = sc.nextInt();

        switch (langChoice) {
            case 1:
                break;
            case 2:
                price += 50;
                break;
            case 3:
                price += 100;
                break;
            default:
                System.out.println("Invalid language choice!");
                sc.close();
                return;
        }

        System.out.print("\nAre you a student with a valid ID? (y/n): ");
        char student = sc.next().charAt(0);
        if (student == 'y' || student == 'Y') {
            price = price * 0.80;
        }

        System.out.print("Is today a festival day? (y/n): ");
        char festival = sc.next().charAt(0);
        if (festival == 'y' || festival == 'Y') {
            price = price * 0.85;   //
        }

        System.out.println("\n-----------------------------");
        System.out.println("Final Ticket Price: Rs. " + price);
        System.out.println("-----------------------------");

        sc.close();
    }
}

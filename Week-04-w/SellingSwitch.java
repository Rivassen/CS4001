import java.util.Scanner;

public class SellingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float markedPrice, sellingPrice;
        char category;
        float discount;

        System.out.print("Enter the marked price: ");
        markedPrice = sc.nextFloat();
        System.out.print("Enter the category (A, B, C, D): ");
        category = sc.next().charAt(0);

        category = Character.toUpperCase(category);

        switch (category) {
            case 'A':
                discount = 60;
                break;

            case 'B':
                discount = 40;
                break;

            case 'C':
                discount = 20;
                break;

            case 'D':
                discount = 10;
                break;

            default:
                System.out.println("Invalid category!");
                return;
        }

        sellingPrice = markedPrice - (markedPrice * discount / 100);

        System.out.println("Selling Price = " + sellingPrice);
    }
}

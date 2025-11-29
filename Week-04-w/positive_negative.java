import java.util.Scanner;

public class positive_negative
{
    

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        
        if(scanner.hasNextInt())
        {
            int number = scanner.nextInt();
            if (number < 0){
                System.out.println("It is negative");
            }
            else if (number > 0){
                System.out.println("It is positive");
            }
            else{
                System.out.println("It is 0");
            }
        }
        
        else {
            System.out.println("Enter a valid integer");
        }
  
    }
}
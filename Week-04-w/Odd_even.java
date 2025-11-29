import java.util.Scanner;

public class Odd_even
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter a number");
       
       if(scanner.hasNextInt())
       {
            int number = scanner.nextInt();
            
            if (number% 2 ==0)
            {
            System.out.println("It is even");
            }
            else
            {
            System.out.println("It is odd");
            }
            
        }
        else
        {
        System.out.println("Enter a valid integer");
        }
    }
}

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class CalculatorWhile {
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        
        while(choice == 'y' || choice == 'Y') 
        {
            
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            System.out.print("Enter operation (+, -, *, /): ");
            char op = sc.next().charAt(0);
            
            double result = 0;
            
            switch(op) 
            {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if(num2 != 0)
                        result = num1 / num2;
                    else
                        System.out.println("Error: Cannot divide by zero!");
                    break;
                default:
                    System.out.println("Invalid operation!");
                    continue;
            }
            
            System.out.println("Result = " + result);
            
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        }
        
        System.out.println("Program ended.");
        sc.close();
    }
}

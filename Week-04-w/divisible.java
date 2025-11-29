import java.util.Scanner;

public class divisible
{
    public static void main(String [] args)
    {
        int num =10;
        
        if (num%3==0 && num%5 == 0)
        {
            System.out.println("It is divisible by both 3 and 5");
        }
        
        else 
        {
            System.out.println("It is not divisible but both");
        }
    }
}
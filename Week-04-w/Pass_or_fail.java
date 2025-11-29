import java.util.Scanner;

public class Pass_or_fail
{
   
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner (System.in);
        System.out.print("Enter your grade:");
        
        if(Scanner.hasNextInt())
        {
            int score = Scanner.nextInt();
            
            if(score >= 0 && score <= 100){
                if (score >= 50){
                System.out.println("You passed");
                }
                else{
                    System.out.println("You failed");
                }
            }
        }
        else{
            System.out.println("Ivalid integer");
            }

    }
}

/**
 * Write a description of class SeriesDoWhile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfSquaresDoWhile 
{
    public static void main(String[] args) 
    {
        int i = 1;
        int sum = 0;

        do 
        {
            sum += i * i;
            i++;
        } while(i <= 10);

        System.out.println("Sum of squares = " + sum);
    }
}

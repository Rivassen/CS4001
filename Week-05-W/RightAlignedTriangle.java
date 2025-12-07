
/**
 * Write a description of class pattern2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RightAlignedTriangle 
{
    public static void main(String[] args) 
    {
        int rows = 5;

        for (int i = 1; i <= rows; i++) 
        {

            for (int s = 1; s <= rows - i; s++) 
            {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}


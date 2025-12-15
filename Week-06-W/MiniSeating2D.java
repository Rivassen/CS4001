
/**
 * Write a description of class MiniSeating2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniSeating2D
{
    public static void main(String[] args)
    {
        String[][] seats = new String[2][3];
        
        seats [0][0] = "Amit";
        seats [0][1] = "Sita";
        seats [0][1] = "Ram";
        
        System.out.println("seating chart:");
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(seats[i][j] == null)
                    System.out.print("[empty]\t");
                else
                    System.out.print(seats[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
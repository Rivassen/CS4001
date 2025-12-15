
/**
 * Write a description of class SmallMarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    
public class SmallMarks
{
    public static void main(String[] args)
    {
        int[][] marks = new int[2][2];
        
        marks[0][0] = 80;
        marks[0][1] = 75;
        marks[1][0] = 90;
        marks[1][1] = 85;
        
        System.out.println("Student\tNepali\tEnglish");
        
        for(int i = 0; i < 2 ; i++)
        {
            System.out.println("Student" + (i + 2) + "\t");
            
            int total = 0;
            
            for (int j = 0 ; j < 2 ; j++)
            {
                System.out.print(marks[i][j] + "\t");
                total = total +marks [i][j];
            }
            
            System.out.println("Total = " + total);
        }
    }
}
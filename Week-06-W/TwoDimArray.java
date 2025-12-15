
/**
 * Write a description of class TwoDimArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDimArray
{
    public static void main(String[] args)
    {
        
        int[][] a;

        a = new int[3][4];

        a[0][0] = 10;
        a[1][1] = 20;

        int[][] b = new int[2][2];

        b[0][0] = 30;
        b[1][1] = 40;

        System.out.println(a[0][0]);
        System.out.println(b[1][1]);
    }
}

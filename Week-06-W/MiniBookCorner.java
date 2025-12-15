
/**
 * Write a description of class MiniBookCorner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniBookCorner
{
    public static void main(String[] args)
    {
        String[] categories = {"Fiction", "Nepali"};
        
        String[][] titles = new String [2][1];
        double[][] prices = new double [2][1];
        
        titles[0][0] = "Asahamati - 5";
        prices[0][0] = 750.00;
        titles[1][0] = "Muna MAdan";
        prices[0][0] = 500.00;
        
        for(int i = 0; i < categories.length; i++)
        {
            System.out.println("Category" + categories[i]);
            System.out.println("Title:" +titles[i][0]);
            System.out.printf("Price: %.2f\n\n", prices[i][0]);
        }
    }
}
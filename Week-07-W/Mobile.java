
/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
    String brand;
    double price;

    boolean isAffordable()
    {
        if (price < 20000)
            return true;
        else
            return false;
    }
}

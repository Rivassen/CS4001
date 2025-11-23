public class DefaultValues
{
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    public static void main(String[] args)
    {

        DefaultValues obj = new DefaultValues();

        System.out.println("Default value of byte: " + obj.byteValue);
        System.out.println("Default value of short: " + obj.shortValue);
        System.out.println("Default value of int: " + obj.intValue);
        System.out.println("Default value of long: " + obj.longValue);

        System.out.println("Default value of float: " + obj.floatValue);
        System.out.println("Default value of double: " + obj.doubleValue);

        System.out.println("Default value of char: '" + obj.charValue + "'");
        System.out.println("Default value of boolean: " + obj.booleanValue);
    }
}


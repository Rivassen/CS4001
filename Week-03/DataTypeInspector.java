public class DataTypeInspector
{
    public static void main(String[] args)
    {


        byte byteValue = 120;                
        short shortValue = 32000;           
        int intValue = 150000;                
        long longValue = 5000000000L;        

        float floatValue = 3.14f;            
        double doubleValue = 99.999;          

        char charValue = 'A';                
        boolean booleanValue = true;       

        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);

        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);

        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + booleanValue);
    }
}

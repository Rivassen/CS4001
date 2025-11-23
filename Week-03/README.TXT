public class MathOperations
{
    public static void main(String[] args)
    {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators (pre-increment & post-increment)
        System.out.println("\n=== Unary Operators ===");
        int x = 5;
        System.out.println("Original x = " + x);
        System.out.println("Post-increment x++ = " + (x++)); // uses x then increments
        System.out.println("After post-increment x = " + x);
        System.out.println("Pre-increment ++x = " + (++x)); // increments then uses
        System.out.println("After pre-increment x = " + x);

        // 3. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int y = 20;
        System.out.println("y = " + y);
        y += 5;
        System.out.println("y += 5 → " + y);
        y *= 2;
        System.out.println("y *= 2 → " + y);

        // 4. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // 5. Logical Operators
        System.out.println("\n=== Logical Operators ===");
        boolean p = true, q = false;
        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p : " + (!p));

        // 6. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
    }
}

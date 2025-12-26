
/**
 * Write a description of class newbook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainLab
{
    public static void main(String[] args)
    {

        System.out.println("LAB 1 : BOOK");

        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "Java";
        b1.author = "James Gosling";
        b1.price = 500;

        b2.title = "Python";
        b2.author = "Guido";
        b2.price = 400;

        System.out.println(b1.title + " " + b1.author + " " + b1.price);
        System.out.println(b2.title + " " + b2.author + " " + b2.price);

        System.out.println("\nLAB 2 : RECTANGLE");

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.length = 6;
        r1.breadth = 4;

        r2.length = 9;
        r2.breadth = 5;

        System.out.println("Area of Rectangle 1 = " + (r1.length * r1.breadth));
        System.out.println("Area of Rectangle 2 = " + (r2.length * r2.breadth));

        System.out.println("\nLAB 3 : EMPLOYEE");

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.id = 1;  e1.name = "A";  e1.salary = 30000;
        e2.id = 2;  e2.name = "B";  e2.salary = 45000;
        e3.id = 3;  e3.name = "C";  e3.salary = 40000;

        Employee highest = e1;
        if (e2.salary > highest.salary) highest = e2;
        if (e3.salary > highest.salary) highest = e3;

        System.out.println("Highest Salary Employee:");
        System.out.println(highest.id + " " + highest.name + " " + highest.salary);
    
        System.out.println("\nLAB 4 : LAPTOP");

        Laptop l1 = new Laptop("Dell", 8, 55000);
        Laptop l2 = new Laptop("HP", 16, 75000);
        Laptop l3 = new Laptop("Lenovo", 12, 65000);

        System.out.println("Laptops with RAM greater than 8GB:");

        if (l1.ram > 8)
            System.out.println(l1.brand + " " + l1.ram + "GB " + l1.price);

        if (l2.ram > 8)
            System.out.println(l2.brand + " " + l2.ram + "GB " + l2.price);

        if (l3.ram > 8)
            System.out.println(l3.brand + " " + l3.ram + "GB " + l3.price);
            
                /* =======================
           LAB QUESTION 5 : MOBILE
           ======================= */
        System.out.println("\nLAB 5 : MOBILE");

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        m1.brand = "Samsung";
        m1.price = 18000;

        m2.brand = "Apple";
        m2.price = 60000;

        m3.brand = "Redmi";
        m3.price = 15000;

        System.out.println("Affordable Mobiles (Price < 20000):");

        if (m1.isAffordable())
            System.out.println(m1.brand + " " + m1.price);

        if (m2.isAffordable())
            System.out.println(m2.brand + " " + m2.price);

        if (m3.isAffordable())
            System.out.println(m3.brand + " " + m3.price);

    
        System.out.println("\nLAB 6 : RESULT");

        Result re1 = new Result();
        Result re2 = new Result();

        re1.subject1 = 70;
        re1.subject2 = 80;
        re1.subject3 = 75;

        re2.subject1 = 60;
        re2.subject2 = 65;
        re2.subject3 = 70;

        System.out.println("Student 1 Result:");
        re1.displayResult();

        System.out.println();

        System.out.println("Student 2 Result:");
        re2.displayResult();

    }
}




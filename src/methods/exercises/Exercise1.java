package methods.exercises;

/**
 * Exercise 1: Basic Methods
 * -------------------------
 * TODO:
 * 1. Create a method `cube(int num)` that returns the cube of a number.
 * 2. Create a method `sayHello(String name)` that prints "Hello, <name>".
 * 3. Call both methods from main().
 */

public class Exercise1
{
    public static void main(String[] args)
    {
        Exercise1 obj = new Exercise1();

        // Example usage
        System.out.println("Square of 4 = " + obj.square(4));

        // Call cube() and sayHello()
        System.out.println("Cube of 3 = " + obj.cube(3));
        obj.sayHello("Sajid");
    }

    // Example method: square
    public int square(int num)
    {
        return num * num;
    }

    // Method: cube
    public int cube(int num)
    {
        return num * num * num;
    }

    // Method: sayHello
    public void sayHello(String name)
    {
        System.out.println("Hello, " + name);
    }
}


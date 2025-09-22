package methods.exercises;

/**
 * Exercise 4: Special Methods
 * ----------------------------
 * TODO:
 * 1. Create a constructor that prints "Object created".
 * 2. Create a varargs method `printStrings(String... words)` that prints all words.
 * 3. Create an abstract class Shape with abstract method `draw()`.
 * 4. Create a subclass Rectangle that implements draw().
 */

public class Exercise4
{
    // Constructor prints "Object created"
    public Exercise4()
    {
        System.out.println("Object created");
    }

    // Varargs method printStrings()
    public void printStrings(String... words)
    {
        for (String word : words)
        {
            System.out.println(word);
        }
    }

    public static void main(String[] args)
    {
        // Test constructor
        Exercise4 obj = new Exercise4();

        // Call printStrings with multiple arguments
        obj.printStrings("Hello", "World", "Java", "Varargs");

        Shape s1 = new Circle();
        s1.draw();

        // Create Rectangle object and call draw()
        Shape s2 = new Rectangle();
        s2.draw();
    }
}

abstract class Shape
{
    // Abstract method draw()
    public abstract void draw();
}

class Circle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class implementing draw()
class Rectangle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Rectangle");
    }
}

package methods.exercises;

/**
 * Exercise 2: Modifiers
 * ----------------------
 * TODO:
 * 1. Create one method with each access modifier:
 *    - public, protected, default, private
 * 2. Create one static method and one final method.
 * 3. Try calling them inside main().
 */

public class Exercise2
{
    public static void main(String[] args)
    {
        Exercise2 obj = new Exercise2();

        // Example usage
        obj.publicMethod();

        // Call other methods
        obj.protectedMethod();
        obj.defaultMethod();
        obj.privateMethod();  // Works because it's inside the same class
        Exercise2.staticMethod();  // Static methods are called with class name
        obj.finalMethod();
    }

    // Example: public method
    public void publicMethod()
    {
        System.out.println("Public method called");
    }

    // Protected method
    protected void protectedMethod()
    {
        System.out.println("Protected method called");
    }

    // Default (package-private) method
    void defaultMethod()
    {
        System.out.println("Default (package-private) method called");
    }

    // Private method
    private void privateMethod()
    {
        System.out.println("Private method called");
    }

    // Static method
    public static void staticMethod()
    {
        System.out.println("Static method called");
    }

    // Final method
    public final void finalMethod()
    {
        System.out.println("Final method called");
    }
}
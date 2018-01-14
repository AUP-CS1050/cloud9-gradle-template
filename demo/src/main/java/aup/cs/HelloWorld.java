package aup.cs;

/**
 * The class is defined as final since utility classes should not be extensible.
 */
public final class HelloWorld {
    /**
     * Utility classes should not have a public or default constructor.
     */
    private HelloWorld() { }

    /**
     * The main method.
     * @param args the input from the command line
     */
    public static void main(final String[] args) {
        System.out.println("Hello world!!!!!");
    }
}

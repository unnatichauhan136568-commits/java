public class p024 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block: Attempting division...");
            int result = 25 / 0; // Throws ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block: Caught " + e.getMessage());
        } finally {
            System.out.println("Inside finally block: This always executes.");
        }

        System.out.println("Program continues after try-catch-finally block.");
    }
}
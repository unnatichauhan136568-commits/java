public class p026 {
    static void checkEligibility(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied: Age must be 18 or older to vote.");
        } else {
            System.out.println("Access granted: You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(15); 
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program execution continues.");
    }
}
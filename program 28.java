
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class p028 {
  
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is invalid. Must be 18 or older to register.");
        }
        System.out.println("Registration successful for age: " + age);
    }

    public static void main(String[] args) {
      
        try {
            System.out.println("Attempting registration with age 15...");
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println();

        
        try {
            System.out.println("Attempting registration with age 22...");
            validateAge(22);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
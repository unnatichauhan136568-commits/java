import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Enter Your Personal Details ===");

       
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

    
        System.out.print("Enter your height (in meters, e.g., 1.75): ");
        double height = scanner.nextDouble();

       
        System.out.print("Enter your gender (M/F/O): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("\n-----------------------------------");
        System.out.println("====== Summary of Your Profile ======");
        System.out.println("-----------------------------------");
        
      
        System.out.println("Name:    " + name);
        System.out.println("Age:     " + age + " years old");
        System.out.println("Height:  " + height + " m");
        System.out.println("Gender:  " + gender);
        System.out.println("Student: " + (isStudent ? "Yes" : "No"));

        
        scanner.close();
    }
}
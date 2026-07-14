
import java.util.Scanner;

class p06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        
        System.out.print("Enter a float value: ");
        float decimal = sc.nextFloat();

        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        
        System.out.print("Enter your name: ");
        String name = sc.next();

       
        System.out.println("\nEntered Values:");
        System.out.println("Integer : " + num);
        System.out.println("Float   : " + decimal);
        System.out.println("Character : " + ch);
        System.out.println("Name    : " + name);

        sc.close();
    }
}
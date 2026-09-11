public class p025 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            
            
            numbers[10] = 50; 
            
            
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Catch Block 1: Arithmetic Exception caught -> " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch Block 2: Array Index Out Of Bounds Exception caught -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Catch Block 3: Parent Exception caught -> " + e.getMessage());
        }

        System.out.println("Program execution continues after catch blocks.");
    }
}
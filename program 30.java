public class p030 {

    static void divide() throws Exception {
        try {
            
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            
            throw new Exception("High-level Operation Failed", e);
        }
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Root Cause: " + e.getCause());
        }
    }
}
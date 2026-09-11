public class p029 {

    
    void method3() {
        int result = 50 / 0;
    }

  
    void method2() {
        method3();
    }

   
    void method1() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in method1: " + e.toString());
        }
    }

    public static void main(String[] args) {
        p029 demo = new p029();
        System.out.println("Main method started.");
        demo.method1();
        System.out.println("Normal flow resumed after handling exception.");
    }
}
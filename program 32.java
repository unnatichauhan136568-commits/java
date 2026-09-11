public class p032 {
    private static String outerStaticField = "Static Outer Field Data";

    
    static class StaticInnerClass {
        void display() {
            System.out.println("Inside Static Inner Class");
            System.out.println("Accessing Outer Static Variable: " + outerStaticField);
        }
    }

    public static void main(String[] args) {
        
        p032.StaticInnerClass inner = new p032.StaticInnerClass();

        
        inner.display();
    }
}
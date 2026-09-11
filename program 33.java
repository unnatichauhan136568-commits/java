public class p033 {
    private String outerField = "Outer Class Field Data";

    void demonstrateLocalInnerClass() {
        String methodVariable = "Local Variable in Method";

       
        class LocalInnerClass {
            void display() {
                System.out.println("Inside Local Inner Class");
                System.out.println("Accessing Outer Variable: " + outerField);
                System.out.println("Accessing Method Variable: " + methodVariable);
            }
        }

       
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }

    public static void main(String[] args) {
        p033 outer = new p033();
        outer.demonstrateLocalInnerClass();
    }
}
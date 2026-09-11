public class p031 {
    private String outerField = "Outer Class Field Data";

   
    class InnerClass {
        void display() {
            System.out.println("Inside Inner Class");
            System.out.println("Accessing Outer Variable: " + outerField);
        }
    }

    public static void main(String[] args) {
        
        p031 outer = new p031();

       
        p031.InnerClass inner = outer.new InnerClass();

       
        inner.display();
    }
}
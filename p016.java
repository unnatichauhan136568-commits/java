abstract class Shape {
    
    abstract void draw();

     void display() {
        System.out.println("Displaying shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}


public class p016 {
    public static void main(String[] args) {
        

        Shape myCircle = new Circle();
        myCircle.display(); 
        myCircle.draw();    
    }
}
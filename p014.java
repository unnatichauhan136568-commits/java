class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Labrador extends Dog {
    void color() {
        System.out.println("The Labrador is golden.");
    }
}


public class p014 {
    public static void main(String[] args) {
        
        Labrador myLab = new Labrador();

                myLab.eat();   
       myLab.bark();  
        myLab.color();
 }
}
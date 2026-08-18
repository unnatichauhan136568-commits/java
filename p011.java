
interface Animal {
    
    void sound();

   
    default void sleep() {
        System.out.println("This animal is sleeping...");
    }
}


class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog says: Bow Wow!");
    }
}


class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat says: Meow Meow!");
    }
}


public class p01 {
    public static void main(String[] args) {
       
        Animal myDog = new Dog();
        myDog.sound();
        myDog.sleep();

        System.out.println("-------------------");

        
        Animal myCat = new Cat();
        myCat.sound();
        myCat.sleep();
    }
}
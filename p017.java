
interface Animal {
    void makeSound(); 
    void sleep();     
}


class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof Woof");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping... Zzz");
    }
}


public class p017 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
    }
}
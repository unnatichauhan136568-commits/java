
interface Animal {
    void eat();
}


interface Pet extends Animal {
    void play();
}


class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing catch.");
    }
}


public class p02 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.play();
    }
}
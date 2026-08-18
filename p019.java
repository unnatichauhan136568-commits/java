
class Animal {
    void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}


public class p019 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); 

        myAnimal.makeSound();
        myDog.makeSound();    
    }
}
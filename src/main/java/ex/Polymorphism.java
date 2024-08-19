package ex;

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal("Some Animal");
        Animal dog = new Dog("Snoopy");
        Animal cat = new Cat("Kitty");
        Speakable cat1 = new Cat("Kitty_1");
        Speakable dog2 = new Dog("Snoopy_2");

        System.out.println(animal.getName());
        System.out.println(cat.getName());
        dog2.speak();
        dog.speak();
        cat1.speak();
    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

interface Speakable {
    default void speak() {
        System.out.println("somebody speaks");
    }
}

class Cat extends Animal implements Speakable {
    public Cat(String name) {
        super(name);
    }

    public String getName() {
        return "Hello Kitty";
    }

    public void speak() {
        System.out.println("Cat say: mew");
    }
}

class Dog extends Animal implements Speakable {
    public Dog(String name) {
        super(name);
    }

    public void speak(String speak) {
        System.out.println(String.format("Dog say: %s", speak));
    }
}

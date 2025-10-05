package Abstraction;


import java.util.Scanner;

class Animal {
    protected String name;

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

public class PolymorphismExample {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter animal type (dog/cat): ");
        String type = sc.nextLine();

        System.out.print("Enter animal name: ");
        String animalName = sc.nextLine();

        Animal a;

        if (type.equalsIgnoreCase("dog")) {
            a = new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            a = new Cat();
        } else {
            a = new Animal();
        }

        a.name = animalName;
        a.makeSound();
    }
}

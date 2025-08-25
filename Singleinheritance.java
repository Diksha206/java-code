package Demo;
//Superclass
class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}

//Subclass (Single Inheritance)
class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking");
	}
}

public class Singleinheritance {
	public static void main(String[] args) {
		Dog myDog = new Dog();

		// Accessing superclass method
		myDog.eat(); // Output: Animal is eating

		// Accessing subclass method
		myDog.bark(); // Output: Dog is barking
	}
}

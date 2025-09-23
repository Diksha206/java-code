package Demo3;



class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}


class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

public class Main567 {
 public static void main(String[] args) {
     Animal myAnimal = new Animal(); 
     Animal myDog = new Dog();       

     myAnimal.sound(); 
     myDog.sound();      
 }
}

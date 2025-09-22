package Demo3;
 


class Vehicle {
 String brand;
 int speed;

 Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 void displayInfo() {
     System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
 }

 void start() {
     System.out.println(brand + " vehicle is starting...");
 }
}

//Derived class 1
class Car extends Vehicle {
 int doors;

 Car(String brand, int speed, int doors) {
     super(brand, speed);  // call parent constructor
     this.doors = doors;
 }

 @Override
 void displayInfo() {
     super.displayInfo();  // call parent method
     System.out.println("Doors: " + doors);
 }

 void honk() {
     System.out.println(brand + " car says: Beep! Beep!");
 }
}

//Derived class 2 (inherits from Car → multilevel)
class ElectricCar extends Car {
 int batteryCapacity;

 ElectricCar(String brand, int speed, int doors, int batteryCapacity) {
     super(brand, speed, doors);
     this.batteryCapacity = batteryCapacity;
 }

 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
 }

 void charge() {
     System.out.println(brand + " electric car is charging...");
 }
}

public class InheritanceDemo {
 public static void main(String[] args) {
     // Vehicle object
     Vehicle v = new Vehicle("Generic", 80);
     v.displayInfo();
     v.start();

     System.out.println();

    
     Car c = new Car("Toyota", 120, 4);
     c.displayInfo();
     c.start();
     c.honk();

     System.out.println();

    
     ElectricCar e = new ElectricCar("Tesla", 200, 4, 85);
     e.displayInfo();
     e.start();
     e.honk();
     e.charge();
 }
}

package Demo3;

class Car {
 private String model;
 private int year;

 public Car(String model, int year) {
     this.model = model;
     this.year = year;
 }

 public String getModel() {
     return model;
 }

 public int getYear() {
     return year;
 }

 public void setYear(int year) {
     if (year > 2000) {
         this.year = year;
     } else {
         System.out.println("Year must be greater than 2000!");
     }
 }
}

public class EncapsulationDemo4 {
 public static void main(String[] args) {
     Car c = new Car("Toyota", 2022);

     System.out.println("Car Model: " + c.getModel());
     System.out.println("Car Year: " + c.getYear());

     c.setYear(2024);
     System.out.println("Updated Year: " + c.getYear());
 }
}

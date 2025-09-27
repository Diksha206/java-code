package Demo3;


import java.util.Scanner;


class Gadget {
 String gadgetName;
 String brand;

 public void inputDetails() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Gadget Name: ");
     gadgetName = sc.nextLine();
     System.out.print("Enter Brand: ");
     brand = sc.nextLine();
 }

 public void displayDetails() {
     System.out.println("Gadget Name: " + gadgetName);
     System.out.println("Brand: " + brand);
 }
}


class Mobile extends Gadget {
 int storage;
 double price;

 public void inputMobileDetails() {
     inputDetails(); 
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Storage (in GB): ");
     storage = sc.nextInt();
     System.out.print("Enter Price: ");
     price = sc.nextDouble();
 }

 public void displayMobileDetails() {
     displayDetails(); 
     System.out.println("Storage: " + storage + " GB");
     System.out.println("Price: ₹" + price);
 }
}


public class InheritanceScannerGadget {
 public static void main(String[] args) {
     Mobile m1 = new Mobile();


     m1.inputMobileDetails();

     System.out.println("\n--- Mobile Details ---");
    
     m1.displayMobileDetails();
 }
}

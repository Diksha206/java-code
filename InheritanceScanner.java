package Abstraction;


import java.util.Scanner;

class Person {
 String name;
 int age;

 public void inputDetails() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter name: ");
     name = sc.nextLine();
     System.out.print("Enter age: ");
     age = sc.nextInt();
 }

 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

class Student extends Person {
 String course;
 double marks;

 public void inputStudentDetails() {
     super.inputDetails();  
     
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter course: ");
     course = sc.nextLine();
     System.out.print("Enter marks: ");
     marks = sc.nextDouble();
 }

 public void displayStudentDetails() {
     super.displayDetails();  
     System.out.println("Course: " + course);
     System.out.println("Marks: " + marks);
 }
}
public class InheritanceScanner {
 public static void main(String[] args) {
     Student s1 = new Student();
     s1.inputStudentDetails();    
     System.out.println("\n--- Student Details ---");
     s1.displayStudentDetails();
 }
}

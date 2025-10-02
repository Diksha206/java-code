

package Abstraction;


abstract class Shape {
 
 abstract double calculateArea();

 
 void displayShapeName(String name) {
     System.out.println("Shape: " + name);
 }
}

interface Resizable {
 void resize(double factor);
}


class Circle extends Shape implements Resizable {
 private double radius;

 Circle(double radius) {
     this.radius = radius;
 }


 double calculateArea() {
     return Math.PI * radius * radius;
 }

 
 public void resize(double factor) {
     radius *= factor;
     System.out.println("Circle resized. New radius = " + radius);
 }
}


class Rectangle extends Shape implements Resizable {
 private double length;
 private double width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }


 double calculateArea() {
     return length * width;
 }


 public void resize(double factor) {
     length *= factor;
     width *= factor;
     System.out.println("Rectangle resized. New length = " + length + ", New width = " + width);
 }
}


public class ShapeAreaCalculator {
 public static void main(String[] args) {
    
     Circle c = new Circle(5);
     c.displayShapeName("Circle");
     System.out.println("Area of Circle = " + c.calculateArea());
     c.resize(2);  
     System.out.println("Area of Circle after resizing = " + c.calculateArea());

     System.out.println("----------------------");

    
     Rectangle r = new Rectangle(4, 6);
     r.displayShapeName("Rectangle");
     System.out.println("Area of Rectangle = " + r.calculateArea());
     r.resize(1.5);  // Resizing rectangle
     System.out.println("Area of Rectangle after resizing = " + r.calculateArea());
 }
}

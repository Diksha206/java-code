package com.inheritance;

class Point {
    int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    String color;

    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    void display() {
        super.display();
        System.out.println("Color: " + color);
    }

public class Main5 {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        ColorPoint cp = new ColorPoint(1, 2, "Red");

        p1.display();
        p2.display();
        cp.display();
    }
}
}
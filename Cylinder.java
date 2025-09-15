package com.inheritance;


	interface Operation {
	    double volume();
	    double PI = 3.142;
	}

	class Cylinder implements Operation {
	    private double radius;
	    private double height;

	    public Cylinder(double radius, double height) {
	        this.radius = radius;
	        this.height = height;
	    }

	    public double volume() {
	        return PI * radius * radius * height;
	    }

	    public static void main(String[] args) {
	        Cylinder cylinder = new Cylinder(5, 10);
	        System.out.println("Volume of cylinder: " + cylinder.volume());
	    }
	}


package Abstraction;



abstract class Vehicle
 {
	 abstract void start();
	 abstract void stop();
	  void fuelType()
	  {
		  System.out.println("Different vehicle use different fuel");
}
 }
	  class Car extends Vehicle 
	  {
		  void start()
		  {
			System.out.println("Car is Starting....")  ;
			
		  }
		  void stop()
		  {
			  System.out.println("Car is Stoped....");
		  }
	  }
 
	  class Bike extends Vehicle
	  {
		  void start()
		  {
			  System.out.println("Bike is Start...");
		  }
		  void stop()
		  {
			  System.out.println("Bike is stop...");
		  }
	  }
public class AbstractVehicle {
	public static void main(String[] args)
	{
		Vehicle c1=new Car ();
		c1.stop();
		c1.start();
		c1.fuelType();
		System.out.println("");
		Vehicle c2=new Bike();
		c2.stop();
		c2.start();
		c2.fuelType();
		
	}
}

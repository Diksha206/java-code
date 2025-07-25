package jjava;
 import java.util.Scanner;
public class Car {
	final int Max_Speed=200;
	String model;
	float speed;

void speed()
{
	if(speed>Max_Speed)
	{
		System.out.println("Result: car is over spedding");
	}
		else {
			System.out.println("Result:car is dirive slowely");
	
	}
} 
	Car(String model,float speed)
	{
		this.model=model;
		this.speed=speed;
	}
	void cardetail()
	{
		System.out.println("the card model is:"+this.model);
		System.out.println("the car speed is:"+this.speed);
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the car model:");
				String model=sc.next();
				System.out.println("enter the car speed:");
				float speed=sc.nextFloat();
				
				Car c1=new Car(model, speed);
				c1.speed();
				c1.cardetail();
				
	}
	{
}
}
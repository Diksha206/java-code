package com.inheritance;
class Car
{
	int carspeed=50;
	int carno=4356;
	String carcolor="Red";
	float carprice=9656748.7f;
	void Display()
	{
		System.out.println("Car speed is:"+carspeed);
		System.out.println("car no is:"+carno);
		System.out.println("car color is: "+carcolor);
		System.out.println("car price is:"+carprice);
	}
}
	class Fortuner extends Car
	{
		void display()
		{
			System.out.println("I am Fortuner");
		}
	}
public class Singleinheritance {
	

	public static void main(String[] Args)
	{
		Fortuner f1=new Fortuner();
		f1.Display();
		f1.display();
	}
}

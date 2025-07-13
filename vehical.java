package javaa;

class Car{
	
	String CarName="SportsCar";
	short CarNum=4500;
	float CarPrice=67895.5f;
	String CarColour="Black";
}
class Bike{
	String BikeName="TVS Apache";
	short BikeNum=7658;
	float BikePrice=40000.5f;
	String BikeColour="Red";
}
class Bicycle{
    String BicycleName="Tyson";
	Short BicycleNum=456;
	float BicyclePrice=4535.2f;
	String BicycleColour="Pink";	
}
public class vehical {
	public static void main(String[] args) {
		Car c1 = new Car();
		Bike b1 = new Bike();
		Bicycle b2 = new Bicycle();
		System.out.println("Car Name is " +  c1.CarName);
		System.out.println("Car Num is " + c1.CarNum);
		System.out.println("Car price" + c1.CarPrice);
		System.out.println("Car colour is " +  c1.CarColour);
		System.out.println("Bike Name is " +  b1.BikeName);
		System.out.println("Bike Num is " + b1.BikeNum);
		System.out.println("Bike price" + b1.BikePrice);
		System.out.println("Bike colour is " +  b1.BikeColour);
		System.out.println("Bicycle Name is " +  b2.BicycleName);
		System.out.println("Car Num is " + b2.BicycleNum);
		System.out.println("Bicycle price" + b2.BicyclePrice);
		System.out.println("Bicycle colour is " +  b2.BicycleColour);  
	}
}  
	
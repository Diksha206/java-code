package jjava;
import java.util.Scanner;
public class Final { 
	
	public static void main(String[] args)
	{
		final float  PI=3.14f;  //final variable
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the circle radius:");   //accept the radius user
		float radius=sc.nextFloat();
		System.out.println("Enter the base");
		double base=sc.nextDouble();
		System.out.println("the the height:");
		double height=sc.nextDouble();
		double AreaCircle=PI*radius*radius;
		System.out.println("the Area of circle is:"+AreaCircle);  //calculate area of circle
		double AreaTriangle=0.5*base*height;
		System.out.println("the Area of Triangle is:"+AreaTriangle);  //calculate area of triangle
		sc.close();
		
		
		
	}

}

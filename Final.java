package jjava;
import java.util.Scanner;
public class Final { 
	
	public static void main(String[] args)
	{
		final float  PI=3.14f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the circle radius:");
		float radius=sc.nextFloat();
		System.out.println("Enter the base");
		double base=sc.nextDouble();
		System.out.println("the the height:");
		double height=sc.nextDouble();
		double AreaCircle=PI*radius*radius;
		System.out.println("the Area of circle is:"+AreaCircle);
		double AreaTriangle=0.5*base*height;
		System.out.println("the Area of Triangle is:"+AreaTriangle);
		sc.close();
		
		
		
	}

}

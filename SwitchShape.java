
//Find the Area of Different Shapes
//Choose from circle, rectangle, triangle, and find the area
// area of triangle=1/2*breadth*height
// area of Rectangle=length*width
//area of circle pi*r*r
package Demo;
import java.util.Scanner;
public class SwitchShape {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the shape:");
	String shape=sc.next();
	switch(shape)
	{
	
	case "Circle":System.out.println("enter the radius:");
	float radius=sc.nextFloat();
	float pi=3.14f;
	float Areaofcircle=pi*radius*radius;
	System.out.println("the area of circle is:"+Areaofcircle);
	break;
	case "Triangle":System.out.println("Enter the breadth:");
	     float breadth=sc.nextFloat();
	     System.out.println("Enter the height:");
	     float height=sc.nextFloat();
	   double  Areaoftriangle=((0.5)*breadth*height);
	   System.out.println("the are of triangle is:"+Areaoftriangle);
	   break;
	case"Rectangle":System.out.println("enter the length: ");
	       float length=sc.nextInt();
	       System.out.println("enter the width:");
	       float width=sc.nextFloat();
	       float Areaofrectangle=length*width;
	       System.out.println("System.out.println:"+Areaofrectangle);
	break;
	
	}
	sc.close();
	
}
}

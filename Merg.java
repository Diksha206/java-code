package merge;
import java.util.Scanner;

public class Merg {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number a:");
		int a=sc.nextInt();
		System.out.println("enter the number b:");
		int b=sc.nextInt();
		System.out.println("the Addition is:"+(a+b));
		System.out.println("the substraction is:"+(a-b));
		System.out.println("the multiplication is:"+(a*b));
		System.out.println("the division is:"+(a/b));
		System.out.println("the modules is:"+(a%b));
		System.out.println("the square is :"+(a*a));
		System.out.println("the cube is:"+(a*a*a));
		System.out.println("");
		System.out.println("enter the length:");
		int length=sc.nextInt();
		System.out.println("enter the width:");
		int width=sc.nextInt();
		System.out.println("the area of rectangle is:"+(length*width));
		System.out.println("the perimeter of rectangle is:"+(2*length+width));
		System.out.println("");
		System.out.println("Enter the tempreture in celsius:");
		int celsius=sc.nextInt();
		System.out.println("tempreture in Celsius:" + celsius);
		
		System.out.println("tempreture in Fahrenhait:" + (celsius * (9.0/5.0) + 32) );
		sc.close();
		
		
		
		
		
		
		
				
		
		
	}

}

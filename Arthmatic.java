package imp;
import java .util.Scanner;

public class Arthmatic {

			public static void main(String[] args)
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("The value of a is:");
			int a = sc.nextInt();
			System.out.println("the value of b is:");
			int b =sc.nextInt();
			
			System.out.println("the Addition is:"+(a+b) );
			System.out.println("the Subtraction is:"+ (a-b));
			System.out.println("the multiplication is:"+a*b);
			System.out.println("the division is:"+(a/b));
			System.out.println("the module is:"+a%b);
			  sc.close();
			
			}
		}
	

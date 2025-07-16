package importance;
import java.util.Scanner;
public class Celsiussc {
	
		public static void main(String[] arg)
		{
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the tempreture in celsius:");
		short celsius=sc.nextShort();
		System.out.println("tempreture in Celsius:" + celsius);
		
		System.out.println("tempreture in Fahrenheit:" + (celsius * (9/5) + 32) );
		sc.close();
		
		
		}	

	}



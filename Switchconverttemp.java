//Convert Temperature Between Celsius and Fahrenheit
//Use switch-case to select the conversion type.
//Celsius to Fahrenheit=(celsius * 9/5) + 32;
//Fahrenheit to Celsius (fahrenheit - 32) * 5/9;
package Demo;
import java.util.Scanner;
public class Switchconverttemp { 

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("celsius to fahrenheit");
		System.out.println("fahrenheit to celsius");
		System.out.println("select the conversion:");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:System.out.println("Enter the value of celsius:");
	             float celsi=sc.nextFloat();
	          
		 float Fahrenheit=(celsi * 9/5) + 32;
			System.out.println("conversion of celsius to fahrenheit is:"+Fahrenheit);
			break;
		case 2:System.out.println("Enter the value of Fahrenheit:");
		        float Fahrenheit2=sc.nextFloat();
		        float Celsius=(Fahrenheit2 - 32) * 5/9;
		        System.out.println("Conversion of fahrenheit to celsius is:"+Celsius);
		        break;
		     
	}
		sc.close();

}
}
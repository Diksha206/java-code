//Convert Currency (USD, INR, EUR)
//Take a currency and convert it to another using predefined rates.

package Demo;
import java.util.Scanner;
public class Switchcurrency {
	public static void main(String[] agrs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("USD to EUR");
		System.out.println("USD to INR");
		System.out.println("INR to USD");
		System.out.println("INR to EUR");
		System.out.println("EUR to INR");
		System.out.println("EUR to USD");
	   System.out.println("Convert 1 to 6:");
	   int num=sc.nextInt();
	  System.out.println("Enter the amount:");
	  float amount=sc.nextFloat();
		switch(num)
		{
		case 1:
	   float covert=amount*0.92f;
	   System.out.println("USD to EUR:"+covert);
	    break;
		case 2:
			float convert0= amount*83;
			System.out.println("USD to INR:"+convert0);
			break;
		case 3:
			float convert3=amount/83;
			System.out.println("INR to USD:"+convert3);
			break;
		case 4:
			float convert4=amount/90;
			System.out.println("INR to EUR:"+convert4);
			break;
		case 5:
			float convert5=amount*90;
			System.out.println("EUR to INR:"+convert5);
			break;
		case 6:
			float convert6=amount*1.08f;
			System.out.println("EUR to USD:"+convert6);
			break;
			default:System.out.println("error");
			sc.close();
			
		}
}
}
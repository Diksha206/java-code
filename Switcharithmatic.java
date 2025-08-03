 
//Menu-Based Program for Arithmetic Operations
//Choose an operation (+, -, *, /) and perform it.

package Demo;
import java.util.Scanner;
public class Switcharithmatic {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num a");
	int a=sc.nextInt();
	System.out.println("Enter the num b");
	int b=sc.nextInt();
	System.out.println("Enter the Arithmetic operation +,-,*,/");
	String Arith=sc.next();
	switch(Arith)
	{
	case "+":System.out.println("addition is "+(a+b));
	break;
	
	case "-":System.out.println("subtractin"+(a-b));
	break;
	
	case "*":System.out.println("multiplication"+(a*b));
	break;
	
	case "/":System.out.println("division"+(a/b));
	break;
	
	}
	sc.close();
}
}

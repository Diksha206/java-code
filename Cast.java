package merge;
import java.util.Scanner;

public class Cast {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of percentage a:");
	float a=sc.nextFloat();
	int b= (int)a;
	System.out.println("the value is: "+(b));
	System.out.println("enter the value of age c:");
	int c=sc.nextInt();
	double d=c;
	System.out.println("the value is:"+(d));
	sc.close();
	
	}

}

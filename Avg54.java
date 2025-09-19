package Demo;
import java.util.Scanner;

public class Avg54 {

	void add(int a,int b,int c)
	{
	
		double d=(a+b+c)/3;
		System.out.println("the avrage is:"+d);
	}
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number a:");
	int a=sc.nextInt();
	System.out.println("Enter the number b:");
	int b=sc.nextInt();
	System.out.println("Enter the number c:");
	int c=sc.nextInt();
	sc.close();
Avg54 a1=new Avg54();
a1.add(a,b,c);
}
}

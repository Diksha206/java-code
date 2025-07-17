package merge;
import java.util.Scanner;

public class Allarith {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number a:");
		int a=sc.nextInt();
		System.out.println("enter a number b:");
		int b=sc.nextInt();
		System.out.println("the Addition is:"+(a+b));
		System.out.println("the substraction is:"+(a-b));
		System.out.println("the multiplication is:"+(a*b));
		System.out.println("the division is:"+(a/b));
		System.out.println("the modules is:"+(a%b));
		System.out.println("the division is:"+(a>b));
		System.out.println("the modules is:"+(a<b));
		System.out.println("the division is:"+(a==b));
		System.out.println("the modules is:"+(a!=b));
		sc.close();
	}

}

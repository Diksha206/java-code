package Demo;
import java.util.Scanner;
public class Ifelsevote {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
System.out.println("enter the age:");
int age=sc.nextInt();
    if(age>=18)
    {
    	System.out.println("you are eligible to vote:");
    }
    else
    {
    	System.out.println("you are not eligible to vote:");
    }

	sc.close();
	}
	}

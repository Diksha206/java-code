package Demo;
import java.util.Scanner;
public class IfelsePassword {


public static void main(String[] arg)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a user name:");
	String name=sc.next();
	System.out.println("Enter the password:");
	String Pass=sc.next();
	if(name.equals("admin")&& Pass.equals("password123"))
	{
	System.out.println("Loging Successfull");
	}
	else if(name.equals("admin"))
	{
		System.out.println("Incorrect Password");
	}
	else
	{
		System.out.println("user name is incorrect");
		sc.close();
	}
}
}


	
  
			
		
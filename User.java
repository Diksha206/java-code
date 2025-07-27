package emp;
import java.util.Scanner;
public class User {
	

	void findMax(int a ,int b,int c)
	{
		int max;
		
		if(a>=b && a>=c)
		{
			max=a;
		}else if(b>=a && b>=c)
		{
			max=b;
		}else {
			max=c;
			
		}
		System.out.println("Larger Number :" + max);
	}
			
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int a=sc.nextInt();
	System.out.println("Enter the value of b:");
	int b=sc.nextInt();
	System.out.println("Enter the valur of c:");
    int c=sc.nextInt();
    
    User a1=new User();
    a1.findMax(a,b,c);
    sc.close();
}

}

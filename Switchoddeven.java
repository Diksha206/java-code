//Check if a Given Number is Odd or Even Using Switch
//Use modulo operation inside switch-case.

package Demo;
import java.util.Scanner;
public class Switchoddeven {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num:");
		int num=sc.nextInt();
	    int mod=num%2;
	    System.out.println("reminder:"+mod);
	    switch(mod)
	    {
	    case 0:
	    	System.out.println("the num is Even");
	    	break;
	    case 1:
	    	System.out.println("the num is odd");
	    	break;
	    	
	    }
	    sc.close();
	
	}
}

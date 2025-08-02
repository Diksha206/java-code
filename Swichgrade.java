//Convert a Grade into Remarks
//A = Excellent, B = Good, C = Average, D = Poor, F = Fail. 

package Demo;
import java.util.Scanner;
public class Swichgrade {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Grade A to F");
		String Grade=sc.next();
		switch(Grade)
		{
		case "A" : System.out.println("Excellent");
		break;
		  
		case "B":System.out.println("Good");
		break;
		
		case "C":System.out.println("Average");
		break;
		
		case "D":System.out.println("Poor");
		break;
		
		case "F":System.out.println("Fail");
		break;
		default:System.out.println("Grade is not Match");
		}
		sc.close();
	}
	

}


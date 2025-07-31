package Demo;
import java.util.Scanner;
public class Ifelsestudent {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student percentage score:");
		int score=sc.nextInt();
		if(score<60)
		{
			System.out.println("Grade E");
		}
		else if(score<70)
		{
			System.out.println("Grade D");
		}
		else if(score<80)
		{
			System.out.println("Grade C");
		}
		else if(score<90)
		{
			System.out.println("Grade B");
		}
		else if(score<100)
		{
			System.out.println("Grade A");
		}
		else 
		{
			System.out.println("Grade F");
	     }
		sc.close();
	}
}

//Write a program to find the cube of given number using functional interface.
package Demo23;
import java.util.Scanner;
interface Cube
{
	int findcube(int n);
}
   public class Findcube
   {
	   public static void main(String[] args)
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter the number:");
		   int num=sc.nextInt();
			   Cube c= (n) ->n * n * n; 
			   int result=c.findcube(num);
			   System.out.println("num is"+num+"cube is:"+result);
		   }
	   }
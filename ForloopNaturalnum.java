
//Sum of First N Natural Numbers
//Calculate and print the sum of the first N natural numbers using a for loop.
package Demo;
import java.util.Scanner;
public class ForloopNaturalnum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the n num");
				int n=sc.nextInt();
				int sum=0;
				for(int i=1;i<=n;i++)
				{
					sum=sum+i;
				}
					System.out.println("the sum of n num is:"+sum);
			
				}
	}

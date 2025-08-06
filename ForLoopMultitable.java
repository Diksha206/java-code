//Print a Multiplication Table
//Given a number N, print its multiplication table up to 10 using a for loop.



package Demo;
import java.util.Scanner;
public class ForLoopMultitable {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	    
	        for (int i = 1; i <= 10; i++) {
	      
	            int result = n * i;

	         
	            System.out.println(n +"x"+ i+ "=" + result);
	        }
	    }
	}
	
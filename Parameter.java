package importance;
import java.util.Scanner;
public class Parameter {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("the length is:");
		float length=sc.nextFloat();
		System.out.println("the width is:");
		short width =sc.nextShort();
		System.out.println("the area is:"+(length*width));
		System.out.println("the perimeter is:"+(2*length+width));
		sc.close();
	}

}

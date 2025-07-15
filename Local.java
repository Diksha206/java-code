package studio;


class Loan
{  
	static int area;
	static int perimeter;
	
	static void blink(int length ,int width)
	{
	    area = length * width;
		perimeter =2 * (length + width);
		
		System.out.println("the area is:"+area );
		System.out.println("the perimeter:"+perimeter);
		
		{
		
		}
		
	}
}
	 
	
public class Local {
	public static void main(String[]args)
	{
		Loan.blink(3, 4);
	}

}

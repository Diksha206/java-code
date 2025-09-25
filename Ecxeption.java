package Demo3;

public class Ecxeption {
public static void main(String[] args)
{
	try
	{
		int a=20;
	int b=0;
	float c=a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		
	}
		finally
		{
			System.out.println("I am Diksha");
		}
	}
}

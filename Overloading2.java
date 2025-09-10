//Write a class Calculator with overloaded add() methods:
// sub(int, int)
// sub(double, double)
//Demonstrate calling both 

package Demo;
class Calculator2
{
	int sub(int a,int b)
	{ 
		return a-b;
	}
double sub(double a,double b)
{
	return a-b;
}
}
public class Overloading2 {
	public static void main(String[] args)
	{
		Calculator2 c2=new Calculator2();
		System.out.println(c2.sub(2,3));
		System.out.println(c2.sub(2.5,3.5 ));
}
}


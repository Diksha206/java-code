//Write a class Calculator with overloaded add() methods:
// add(int, int)
// add(double, double)
//Demonstrate calling both 

package Demo;
class Calculator
{
  void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

  void add(double a,double b)
  {
	  double c=a+b;
	  System.out.println(c);
  
  }
  }

public class Overloading {
	public static void main(String[] args)
	{
		Calculator c1=new Calculator();
		 c1.add(5, 6);
		 c1.add(5.4, 9.5);
	}
}


	


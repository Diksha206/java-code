package demo234;
class Spere
{
	private double radius;
	public Spere(double r)
	{
		if(r>0)
		{
		
			this.radius=r;
	}
			else
			{
		
			System.out.println("Invalid radius! setting radius to 1");
			this.radius=1;
		}
	}
		public double Surfacearea()
		{
			return 4*Math.PI*radius*radius;
		}

		public double volume()
		{
			return(4.0)/(3.0)*Math.PI*radius*radius*radius;
			
	}
		public void display()
		{
			System.out.println("Radius: " + radius);
		    System.out.println("Surface Area: " + Surfacearea());
		    System.out.println("Volume: " + volume());
		}
}
public class MainSpere {
public static void main(String args[])
{
	Spere s1=new Spere(5);
	Spere s2=new Spere(-3);
	s1.display();
	s2.display();
	
}
}

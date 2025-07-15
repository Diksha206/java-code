package project;
class Mode
{
	int Divident=17;
	int Divisor=5;
	  void opr()
	{
	int remainder=Divident % Divisor;
	System.out.println("the remainder is:"+remainder);
		
	}
			
}
public class Imp {
	public static void main(String[] args)
	{
	Mode m1=new Mode();	
	m1.opr();
	

	
	}

}

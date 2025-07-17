package nice;
class Net
	{
		void greetUser()
		{
			System.out.println("welcome");
		}
		   int square(int num)
		   {
			   System.out.println("the square is:"+(num*num));
			   return num;
		   }

		   void showDetails(String name,int age)
		   { 
			   
		   
			   System.out.println("the name is:"+name);
			   System.out.println("the age is:"+age);
		   }
			   double getPi(float Pi)
			   { 
				   
				   System.out.println("the value is:"+Pi);
				   return Pi;
			   }
	}
		   
		public class Os 
		{
		public static void main(String[] args)
		{
		Net n = new Net();
		
		n.greetUser();
		n.square(4);
		n.showDetails("diksha", 20);
		n.getPi(3.14159f);

		}
	}
	

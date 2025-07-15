package project; 
class Net
{
	 void tempreture(int celsius)
	{
	int fahrenheit=(celsius*9/5)+32;
	System.out.println("tempreture to celsius convert to:"+fahrenheit);
	
		}
	}
public class Black {
	
	public static void main(String[] args) 
	{
	Net n1=new Net();
	n1.tempreture(12);
    }
}
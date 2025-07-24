package nice;
class Circle 
{
	static float pi=3.14f;

	void old(int radius)
	{
		int area;
		area=(int)pi*radius*radius;
		System.out.println("the area is:"+area);
	}
}
	

public class Setting {
	public static void main(String[] args)
	{
		Circle c1=new Circle();
		c1.old(2);
    
}
}

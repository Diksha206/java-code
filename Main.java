package diksha;

import java.util.Scanner;
class Product
{
	int id;
	String Name;
	float Price;
	static String Category;
	
	static
	{
		Category="Electronic";
		System.out.println("Category is:"+Category);
	}
	
	Product(int id,String Name,float Price)
	{
	this.id=id;
	this.Name=Name;
	this.Price=Price;
	}
	
	void display()
	{
		System.out.println("Product id id:"+id);
		System.out.println("Product Name is:"+Name);
		System.out.println("Product Category is:"+Price);
	}
	
}
public class Main {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product id :");
		int id=sc.nextInt();
		System.out.println("Enter the Product Name:");
		String Name=sc.next();
		System.out.println("Enter the Product Price:");		
		float Price=sc.nextFloat();
		
		Product p= new Product(id,Name,Price);
		p.display();
		s.close();
	}
}

package student;
import java.util.Scanner;
public class Library {
	String title;
	String author;
	int Price;
	Library(String title,String author,int Price)
	{
		this.title=title;
		this.author=author;
		this.Price=Price;
	}
		void display()
		{
			System.out.println("title is:"+title);
			System.out.println("the author is:"+author);
			System.out.println("the price is:"+Price);
		}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title:");
		String title=sc.next();
		System.out.println("Enter the author:");
		String author=sc.next();
		System.out.println("Enter the Price:");
		int Price=sc.nextInt();
		Library a=new Library(title,author,Price);
		a.display();
		sc.close();
				
	}

}

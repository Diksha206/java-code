package jjava;
import java.util.Scanner;
public class Employee {


	static String companyName;      //static variable
	int Id;     //instance variable
	String Name;
	float Salary;
	
	static {
		companyName="Tcs";
	}
	
	Employee(int Id,String Name,float Salary)//contructor to initialize name,id,salary
	{
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
	}
	void Display()//display method
	{
		System.out.println("Employee Id :"+Id);
		System.out.println("Employee Name :"+Name);
		System.out.println("Employee Salary :"+Salary);
		System.out.println("Employee Company Name :"+companyName);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);      //use scanner to input data
		System.out.printf("Enter Employee Id :-");
		int id = sc.nextInt();
		System.out.printf("Enter Employee Name :-");
		String name = sc.next();
		System.out.printf("Enter Employee salary43:-");
		float salary = sc.nextFloat();
		Employee e1 = new Employee(id,name,salary);
		e1.Display();
		sc.close();
	}
}
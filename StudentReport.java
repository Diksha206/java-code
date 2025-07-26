package student;
import java.util.Scanner;
public class StudentReport {
	String StudName;
	int StudRollno;
	double StudMarks;
	char studDiv;
	float StudPer;
	byte Studid;
	boolean StudPassed;
	short StudBatchno;
	long StudContactNo;
	{}
		void studinfo()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Student Name:");
			String Name=sc.next();
			System.out.println("Enter a Student Roll No:");
			int Rollno=sc.nextInt();
			System.out.println("Enter a Student mark:");
			double Mark=sc.nextDouble(); 
			System.out.println("Enter a Student Division:");
			char Div=sc.next().charAt(0);
			System.out.println("Enter a Student Percentage:");
			float Per=sc.nextFloat();
			System.out.println("Student is Passed(Ture/False):");
			boolean Passed=sc.nextBoolean();
			System.out.println("Enter a Student Batch no:");
			short Batch=sc.nextShort();
			System.out.println("Enter a Student Contact No:");
			long Contactno=sc.nextLong();
			
			System.out.println("Student Name is:"+Name);
			System.out.println("Student Roll no is:"+Rollno);
			System.out.println("Student Mark is:"+Mark);
			System.out.println("Student Division  is:"+Div);
			System.out.println("Student Percentage is:"+Per);
			System.out.println("Student is Passed:"+Passed);
			System.out.println("Student Contact no is:"+Contactno);
			sc.close();
		}


public static void main(String[] args)
{
	StudentReport a=new StudentReport();
	a.studinfo();
}	
}
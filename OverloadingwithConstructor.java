//Create a class Student with multiple constructors:
// One accepting only name
// One accepting name and rollNo
// One accepting name, rollNo, and marks
//Show constructor overloading.

package Demo;
class Student
{
	String name;
	int rollno;
	float  marks;

Student(String name)
{
	this.name=name;
	System.out.println("name:"+name);
}
Student(String name,int rollno)
{
	this.name=name;
	this.rollno=rollno;
	System.out.println("name:"+name+" "+"rollno:"+rollno);
}
	
Student(String name,int rollno,float marks)
{
	this.name=name;
	this.rollno=rollno;
	this.marks=marks;
	System.out.println("name:"+name+" "+"rollno:"+rollno+" "+"marks:"+marks);
}
}
public class OverloadingwithConstructor {
	public static void main(String args[])
	{
		Student s1=new Student("Diksha");
		Student s2=new Student("Suraj",10);
		Student s3=new Student("sanika",10,90);
	}
}



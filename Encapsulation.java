package Demo;

class Employee{
    private  String emp_name;
     private int emp_id;
     private float emp_salary;
     private long emp_number;      

public String getEmp_name() {
	return emp_name;
}

public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}

public int getEmp_id() {
	return emp_id;
}

public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

public float getEmp_salary() {
	return emp_salary;
}

public void setEmp_salary(float emp_salary) {
	this.emp_salary = emp_salary;
}

public long getEmp_number() {
	return emp_number;
}

public void setEmp_number(long emp_number) {
	this.emp_number = emp_number;
}
}
public class Encapsulation {
public static void main(String args[])
{
	Employee e=new Employee();
	e.setEmp_name("ram");
	e.setEmp_id(2);
	e.setEmp_salary(23.9606f);
	e.setEmp_number(34574475);
	System.out.println( e.getEmp_name()+"\n"+e.getEmp_id()+"\n"+e.getEmp_salary()+"\n"+e.getEmp_number());
}
}
package Demo3;


class Student {
 private String name;
 private int age;
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     if (age > 0) { 
         this.age = age;
     } else {
         System.out.println("Age must be positive");
     }
 }
}


public class Encapsulation09 {

 public static void main(String[] args) {
     Student student = new Student();

     
     student.setName("Diksha");
     student.setAge(20);

    
     System.out.println("Name: " + student.getName());
     System.out.println("Age: " + student.getAge());
 }
}

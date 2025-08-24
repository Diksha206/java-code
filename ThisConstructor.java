package com.inheritance;

class Student {
    String Studname;
    int Studid;
    float Studper;
    int Studrollno;

    Student() {
        this("diksha");
    }

    public Student(String Studname) {
        this(23); 
        this.Studname = Studname;
        System.out.println("Student name is: " + Studname);
    }

    public Student(int Studrollno) {
        this(89.8f);  
        this.Studrollno = Studrollno;
        System.out.println("Student roll no is: " + Studrollno);
    }

   

    public Student(float Studper) {
        this.Studper = Studper;
        System.out.println("Student percentage is: " + Studper);
    }
}

public class ThisConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
package Demo;
	import java.util.Scanner;

	class StudentInfo {
	    int rollno;
	    String name;
	    String className;
	    double percentage;

	    public StudentInfo(int rollno, String name, String className, double percentage) {
	        this.rollno = rollno;
	        this.name = name;
	        this.className = className;
	        this.percentage = percentage;
	    }

	    public void displayInfo() {
	        System.out.println("Roll No: " + rollno);
	        System.out.println("Name: " + name);
	        System.out.println("Class: " + className);
	        System.out.println("Percentage: " + percentage + "%");
	    }
	}

	class StudentPer {
	    public static double calculatePercentage(int[] marks) {
	        int totalMarks = 0;
	        for (int mark : marks) {
	            totalMarks += mark;
	        }
	        return (double) totalMarks / marks.length;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter roll number: ");
	        int rollno = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        System.out.print("Enter name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter class: ");
	        String className = scanner.nextLine();

	        int[] marks = new int[6];
	        System.out.println("Enter marks for 6 subjects:");
	        for (int i = 0; i < 6; i++) {
	            marks[i] = scanner.nextInt();
	        }

	        double percentage = StudentPer.calculatePercentage(marks);

	        StudentInfo student = new StudentInfo(rollno, name, className, percentage);
	        student.displayInfo();
	    }
	}

package Demo;
class Calculator3 {
	 int add(int a, int b) {
	 return a + b;
	 }

	 int add(int a, int b, int c) {
	 return a + b + c;
	 }
	 double add(double a, double b) {
	 return a + b;
	 }
	}
	
	 
 public class Overload3
 {
	 public static void main(String[] args) {
		 Calculator3 calc = new Calculator3();
		 System.out.println(calc.add(10, 20)); // calls first method
		 System.out.println(calc.add(10, 20, 30)); // calls second method
		 System.out.println(calc.add(5.5, 4.5)); // calls third method
		 }
		}
		
 
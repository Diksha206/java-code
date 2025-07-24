package nice;
 class TempretureConverter
 {
	 static void Celsi(double C,float F)
	 {
		 double Fahrenheit=(C*9/5+32);
		 float Celsius=(F-32)*5/9;
		 System.out.println("convert tempreture from celsius to fahrenheit:"+Fahrenheit);
		 System.out.println("covert tempreture from fahrenheit to celsius:"+Celsius);
	 }
 }
public class Tempreture19 {
	public static void main(String[] args)
	{
   TempretureConverter.Celsi(10, 20.2f);
   
}
}
//Find the Number of Days in a Given Month and Year
//Consider leap years while checking February.  jan= 31 ,feb = 29 , march= 31


package Demo;
import java.util.Scanner;
public class Switchmonth {
	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the leap year January-December");
     String Years=sc.next();
     
     switch(Years)
{ 
     case "Jan":System.out.println("31");
     break;
     
	case "Feb":System.out.println("30");
    break;
 
   case "March":System.out.println("31");
    break;

   case "April":System.out.println("30");
   break;

  case "May":System.out.println("31");
   break;

   case "June":System.out.println("30");
   break;

   case "July":System.out.println("31");
   break;

   case "Agust":System.out.println("31");
   break;

   case "Sep":System.out.println("30");
   break;

   case "Oct":System.out.println("31");
   break;
   case "Nov":System.out.println("30");
   break;

    case "Dec":System.out.println("31");
    break;
   }
     sc.close();

   }

	}


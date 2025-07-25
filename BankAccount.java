package jjava;

import java.util.Scanner;

public class BankAccount {
static String BankName="state bank";
float balance;
    static void ShowBankName() //static method show bank name
    {
    	System.out.println("the bank name is:"+BankName);
    }
	    
      void display()    //display balance
    {
    	  Scanner sc=new Scanner(System.in);  //use scanner to input
		   System.out.println("enter the balance:");
		   double balance=sc.nextDouble();
		   System.out.println("current balance is:"+balance);
		   sc.close();
    }
	   public static void main(String[] args)
	   {
		   
		 BankAccount a=new BankAccount();
		   a.display();
		 
		   
	   }

	  
	   }
   


package jjava;

import java.util.Scanner;

public class Bankaccthis {
	static String BankName="state bank";
	
	float balance;
	    static void ShowBankName() //static method show bank name
	    {
	    	
	    	System.out.println("the bank name is:"+BankName);
	    }
		    
	      void display(float balance)    //display balance
	    {
	    	  this.balance=balance; //use this
	    	  System.out.println("current balance is:"+balance);
	    	  
	    }
		   public static void main(String[] args)
		   {
			   Bankaccthis.ShowBankName();
			   Scanner sc=new Scanner(System.in);  //use scanner to input
			   System.out.println("enter the balance:");
			   float balance=sc.nextFloat();
			  
			  
			 Bankaccthis a=new Bankaccthis();
			 
			   a.display(balance);
			   sc.close();
			  
			   
		   }

		  
		   }
	   




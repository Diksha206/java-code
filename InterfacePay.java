//. Payment Gateway (Interface Example)
//
//Define an interface Payment with methods:
//
//pay(double amount)
//
//refund(double amount)
//
//
//Implement it in two classes: CreditCardPayment and UPIPayment.
//👉 Demonstrate their usage in a shopping application where different payment methods are used.



package Abstraction;
interface Payment
{
	void pay(double amount);
	void refund(double amount);
}
		class CreditCardPayment implements Payment
		{
			public void pay(double amount)
			{
				System.out.println("pay"+ amount+"using creditcard");
			}
			public void refund(double amount)
			{
				System.out.println("refund"+amount+"using creadit card");
			}
		}
			class UPIPayment implements Payment
			{
				public void pay(double amount)
				{
					System.out.println("pay"+ amount+"using UPTPayment");
				}
				public void refund(double amount)
				{
					System.out.println("refund"+amount+"using UPIPayment");
				}
			}
public class InterfacePay {
	public static void main(String[] args)
	{
		Payment p1=new CreditCardPayment();
		p1.pay(1000);
		p1.refund(500);
		System.out.println("");		
		Payment p2=new UPIPayment();
		p2.pay(3000);
		p2.refund(400);
		
	}
}



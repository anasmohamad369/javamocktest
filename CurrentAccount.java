package test;

public class CurrentAccount extends BankAcoount
{

	private double balance;//variable declaring in local without overriding

	private double moneytaken; //it was the method to assign the value and display the balance


	@Override
	void deposit(double balance) //it was the method to assign the value and display the balance
	{
         this.balance =balance;		
         System.out.println("the currrent balance in Current Account"+" "+balance);
	}

	@Override
	void withdraw(double moneytaken) //it was the method to assign the value and display the balance
	{
		this.moneytaken =moneytaken;
		System.out.println("Money Withdrawing from the Current Account  "+" "+moneytaken);

	}
	
}

package test;

public class SavingsAccount extends BankAcoount
{

	private double balance; //variable declaring in local without overriding
	private double moneytaken;

	@Override
	void deposit(double balance) //it was the method to assign the value and display the balance
	{
         this.balance =balance;		//assigning the balance using the this keyword
         System.out.println("the Current balance in saving account is "+balance);
	}

	@Override
	void withdraw(double moneytaken) //it was the method to assign the value and display the balance
	{
		this.moneytaken =moneytaken;//assigning the balance using the this keyword
		System.out.println("MOney Withrdrawing from Saving Acoount is"+moneytaken);

	}

}

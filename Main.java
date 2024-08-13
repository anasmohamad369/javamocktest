package test;

public class Main 
{
	public static void main(String[] ar)
	{
		SavingsAccount bank1 =new  SavingsAccount();//assign the vaue in the savings account
		bank1.deposit(10000);
		bank1.withdraw(500);
		
		CurrentAccount bank2 = new CurrentAccount();//asssign the value in the current account
		bank2.deposit(1000);
		bank2.withdraw(200);
		
		
	
	}

}

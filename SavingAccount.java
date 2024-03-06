package inheritancedemo;

public class SavingAccount extends BankAccount
{
	
	public SavingAccount(String accountNumber, double balance) 
	{
		super(accountNumber, balance);
			
	}
	public void withdraw(double amount)
	{
			if(getBalance() -amount < 100) //this condition is for saving acount 
			{
				System.out.println("You requied to maintain the min balance amount taht is 100INR");
			}
			else
			{
				super.withdraw(amount);
			}
	}
	

}



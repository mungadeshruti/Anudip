package inheritancedemo;

public class ChekingAccount extends BankAccount{
	 super(initialBalance);
	 public ChekingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		
	}
	private double overdraftFee;
	 
	 public void CheckingAccount(double initialBalance, double overdraftFee) {
		  
		    this.overdraftFee = overdraftFee;
	
}
	 @Override
	  public void withdraw(double amount) {
	    if (amount <= getBalance()) {
	      super.withdraw(amount);
	    } else {
	      System.out.println("Overdraft fee applied.");
	      super.withdraw(amount + overdraftFee);
	    }
	  }
	}
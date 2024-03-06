package inheritancedemo;

 class SavingAccount1 extends BankAccount{
	 private double withdrawalLimit;

	    public SavingsAccount(double balance, double withdrawalLimit) {
	        super(balance);
	        this.withdrawalLimit = withdrawalLimit;
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance && amount <= withdrawalLimit) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	            System.out.println("Current balance: $" + balance);
	        } else {
	            System.out.println("Withdrawal limit exceeded or insufficient funds");
	        }
	    }
	}
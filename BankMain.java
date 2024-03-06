package inheritancedemo;

public class BankMain {

	public static void main(String[] args) {
		System.out.println("Initial balance for the account A/C-2575 is 500 ");
		
		BankAccount A2575=new BankAccount("A/C-2575", 500);

		//deposit the amount in the bank
		
		System.out.println("Deposit 1000 rs into account A/C-2575");
		A2575.deposit(1000);
		System.out.println("New balance after deposting 1000rs is " + A2575.getBalance()) ;
		
		// withdraw the amount 600 from the account
		System.out.println("withdraw the amount 600 from the account A2575");
		A2575.withdraw(600);
		System.out.println("New balance after withdrwaing  600rs is " + A2575.getBalance()) ;
		
		/*create a object saving account
		initial amount 450rs
		
		withdraw(300)
		getbalance();*/
		


	}

}

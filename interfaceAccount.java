package com.demo;

public class interfaceAccount {
	 void deposit(double amount) {
	}
	    void withdraw(double amount) {
		}
	    double getBalance() {
			return 0;
		}
	}

	class SavingsAccount implements Account {
	    private double balance;

	    public SavingsAccount(double initialBalance) {
	        balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}




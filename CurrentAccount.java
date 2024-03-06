package com.demo;

public class CurrentAccount {
	 private double balance;

	    public CurrentAccount(double initialBalance) {
	        balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        balance -= amount;
	    }

	    public double getBalance() {
	        return balance;
	    }
	}



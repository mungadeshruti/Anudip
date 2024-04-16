package com.thread;

public class BankAccount 
{
	 private double balance;

	    public BankAccount(double initialBalance) 
	    {
	        balance = initialBalance;
	    }

	    public synchronized void deposit(double amount) 
	    {
	        balance += amount;
	        System.out.println("Deposit: " + amount);
	    }

	    public synchronized void withdraw(double amount) 
	    {
	        if (balance >= amount) 
	        {
	            balance -= amount;
	            System.out.println("Withdrawal: " + amount);
	        } 
	        else 
	        {
	            System.out.println("Insufficient funds for withdrawal: " + amount);
	        }
	    }

	    public double getBalance() 
	    {
	        return balance;
	    }
	}
public class BankAccountThreads
{
	 public static void main(String[] args) 
	    {
	        BankAccount account = new BankAccount(1000);

	        Thread depositThread = new Thread(() -> 
	        {
	            for (int i = 0; i < 5; i++) 
	            {
	                account.deposit(100);
	            }
	        });

	        Thread withdrawThread = new Thread(() -> 
	        {
	            for (int i = 0; i < 3; i++) 
	            {
	                account.withdraw(200);
	            }
	        });

	        depositThread.start();
	        withdrawThread.start();
	    }
	}

	


package com.thread;

public class PrimeSumThread extends Thread 
{
	 private int limit;
	    private long primeSum;

	    public PrimeSumThread(int limit) 
	    {
	        this.limit = limit;
	        this.primeSum = 0;
	    }

	    public void run() {
	        for (int i = 2; i <= limit; i++) 
	        {
	            if (isPrime(i)) 
	            {
	                primeSum += i;
	            }
	        }
	    }

	    public long getPrimeSum() 
	    {
	        return primeSum;
	    }

	    private boolean isPrime(int n) 
	    {
	        if (n <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) 
	        {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	}

	public class PrimeSumThreads 
	{
	public static void main(String[] args) 
	{
		 int limit = 100;
	        PrimeSumThread thread1 = new PrimeSumThread(limit / 2);
	        PrimeSumThread thread2 = new PrimeSumThread(limit);

	        thread1.start();
	        thread2.start();

	        try 
	        {
	            thread1.join();
	            thread2.join();
	        } 
	        catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }

	        long totalSum = thread1.getPrimeSum() + thread2.getPrimeSum();
	        System.out.println("Sum of prime numbers up to " + limit + ": " + totalSum);
	    }
	


	}



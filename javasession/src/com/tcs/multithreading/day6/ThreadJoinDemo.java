package com.tcs.multithreading.day6;

class Login extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +" is running");
		}
	}
}

class Transaction extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +" is running");
		}
	}
}


public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {

		Login login = new Login();
		Transaction transaction = new Transaction();
		
		login.setName("login");
		transaction.setName("transaction");
		
		login.start();
		login.join();
		transaction.start();
	}

}

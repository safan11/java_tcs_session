package com.tcs.multithreading.day6;

class Sanjay  extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			
			System.out.println(Thread.currentThread().getName() +" is running");
		}
	}
}

class Aswin  extends Thread
{
	@Override
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			
			System.out.println(Thread.currentThread().getName() +" is running");
		}
	}
}




public class MultitaskingDemo {

	public static void main(String[] args) {

		System.out.println("Main Thread :"+Thread.currentThread().getName());
		
		Sanjay sanjay = new Sanjay();
		Aswin aswin = new Aswin();
		
		//sanjay.run();
		//aswin.run();
		
		sanjay.setName("Sanjan");
		aswin.setName("aswin");
		
		sanjay.setPriority(2);
		aswin.setPriority(9);

		
		sanjay.start();  // It will call the run method
		aswin.start();
		}
}

package com.lakkam.threads;

class MyRunnable implements Runnable{
	
	private int balance = 20;
	@Override
	public void run() {
		withDrawAmount(10);
		
	}

	private synchronized void withDrawAmount(int amount) {
		if(amount<=balance) {
			System.out.println("Withdrawing amount is :"+amount+" : With : "+MyThread.currentThread().getName());
			balance = balance-amount;
			
			System.out.println("Balance after successful withdraw : "+balance+" : With : "+MyThread.currentThread().getName());
			try {
				MyThread.currentThread().wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Insufficient Funds : Remaining Balance"+balance+" : With : "+MyThread.currentThread().getName());
		}
		
	}
	
}
public class TestSynchronization {

	public static void main(String[] args) {
	MyRunnable myRunnableObject = new MyRunnable();
	Thread myThread1 = new Thread(myRunnableObject);
	myThread1.setName("Lakkam");
	myThread1.start();
	
	Thread myThread2 = new Thread(myRunnableObject);
	myThread2.setName("Nani");
	myThread2.start();
	
	Thread myThread3 = new Thread(myRunnableObject);
	myThread3.setName("Prachu");
	myThread3.start();

	}

}

package com.lakkam.threads;

class Thread1 extends Thread {

	Customer c;

	public Thread1(Customer c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.withdraw(15000);
	}
}

class Thread2 extends Thread {

	Customer c;

	public Thread2(Customer c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.deposit(10000);
	}
}

class Thread3 extends Thread {

	Customer c;

	public Thread3(Customer c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.deposit(10000);
	}
}

public class PCTest {
	public static void main(String arg[]) {
		final Customer c = new Customer();
		
		Thread1 t1 = new Thread1(c);
		t1.start();
		
		Thread2 t2 = new Thread2(c);
		t2.start();
		
		Thread3 t3 = new Thread3(c);
		t3.start();
		
		
		/*
		 * new Thread() { public void run() { c.withdraw(15000); } }.start(); new
		 * Thread() { public void run() { c.deposit(10000); } }.start(); new Thread() {
		 * public void run() { c.deposit(10000); } }.start();
		 */
	}
}

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Available Balance " + this.amount);
		System.out.println("Going to withdraw." + amount);

		if (this.amount < amount) {
			System.out.println("Insufficient Balance waiting for deposit.");
			try {
				wait();
			} catch (Exception e) {
				System.out.println("Interruption Occured");
			}
		}
		this.amount -= amount;
		System.out.println("Detected amaount: " + amount);
		System.out.println("Balance amount : " + this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit " + amount);
		this.amount += amount;
		System.out.println("Available Balance " + this.amount);
		System.out.println("Transaction completed.\n");
		notify();
	}
}

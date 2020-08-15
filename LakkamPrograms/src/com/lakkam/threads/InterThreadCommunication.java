package com.lakkam.threads;

import java.util.ArrayList;
import java.util.List;

class Account1 extends Thread {
	Amazon amazonObject;

	public Account1(Amazon amazonObject) {
		this.amazonObject = amazonObject;
	}

	@Override
	public void run() {

		amazonObject.buyItems("Laptop");
	}

}

class Account2 extends Thread {
	Amazon amazonObject;

	public Account2(Amazon amazonObject) {
		this.amazonObject = amazonObject;
	}

	@Override
	public void run() {
		amazonObject.addItems("Laptop");
	}

}

class Account3 extends Thread {

	Amazon amazonObject;

	public Account3(Amazon amazonObject) {
		this.amazonObject = amazonObject;
	}

	@Override
	public void run() {
		amazonObject.addItems("Mouse");
	}

}

class Amazon {
	List itemList = new ArrayList();

	public synchronized void buyItems(String item) {
		if (item != null) {
			if (!(itemList.contains(item))) {
				try {
					System.out.println("Thread is waiting for items from the list : Thread Name"
							+ Thread.currentThread().getName());
					wait();
				} catch (Exception e) {
					System.out.println("Thread is waiting for items from the list : Thread Name"
							+ Thread.currentThread().getName());
				}
			}

			if ((itemList.contains(item))) {
				System.out.println("Purchased Items By : " + Thread.currentThread().getName() + "ItemName : " + item);
			}
			/*
			 * while (itemList.iterator().hasNext()) { if
			 * ((itemList.iterator().next()).equals(item)) { System.out
			 * .println("Purchased Items By : " + Thread.currentThread().getName() +
			 * "ItemName : " + item); } }
			 */
		}
		System.out.println("Item bought and removed from List : " + item);
		itemList.remove(item);
	}

	public synchronized void addItems(String addingItem) {
		if (addingItem != null) {
			itemList.add(addingItem);
			System.out
					.println("Items added by : " + Thread.currentThread().getName() + " : added Item : " + addingItem);
			if (!(itemList.isEmpty())) {
				System.out.println("Sending notification after adding Items...");
				notify();
			}
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		Amazon amazonItems = new Amazon();
		Account1 firstAccount = new Account1(amazonItems);
		firstAccount.setName("Account1");
		Account2 secondAccount = new Account2(amazonItems);
		secondAccount.setName("Account2");
		Account3 thirdAccount = new Account3(amazonItems);
		thirdAccount.setName("Account3");

		firstAccount.start();
		secondAccount.start();
		thirdAccount.start();

	}

}

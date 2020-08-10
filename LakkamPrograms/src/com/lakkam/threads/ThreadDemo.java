package com.lakkam.threads;

class MyThread extends Thread {

	private int totalMenEmployees;
	private int totalWomenEmployees;
	private int totalEmployeeCount;

	public int getTotalEmployeeCount() throws InterruptedException {
		MyThread.currentThread().sleep(1000);
		return totalWomenEmployees + totalMenEmployees;
	}

	public int getTotalMenEmployees() {
		return totalMenEmployees;
	}

	public void setTotalMenEmployees(int totalMenEmployees) {
		this.totalMenEmployees = totalMenEmployees;
	}

	public int getTotalWomenEmployees() {
		return totalWomenEmployees;
	}

	public void setTotalWomenEmployees(int totalWomenEmployees) {
		this.totalWomenEmployees = totalWomenEmployees;
	}

	@Override
	public void run() {
		// getTotalMenEmployees(totalMenEmployees, totalWomenEmployees);

		try {
			totalEmployeeCount = getTotalEmployeeCount();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(
				" run method...with .." + MyThread.currentThread().getName() + "..." + totalEmployeeCount);

	}

}

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread threadObject = new MyThread();
		threadObject.setName("First Thread");

		MyThread threadObject2 = new MyThread();
		threadObject2.setName("Second Thread");

		threadObject.setTotalMenEmployees(2000);
		threadObject.setTotalWomenEmployees(3000);

		threadObject2.setTotalMenEmployees(500);
		threadObject2.setTotalWomenEmployees(200);
		
		threadObject.start();
		threadObject2.start();

	}

}

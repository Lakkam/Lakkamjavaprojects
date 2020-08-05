package com.lakkam.exceptionhandling;

class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String exceptionMessage) {
		super(exceptionMessage);
	}

}

class Bank {
	float bankBalance = 500000;

	public String getWithdrawAmount(int withdrawAmount) throws InsufficientBalanceException {

		if (withdrawAmount > bankBalance) {
			throw new InsufficientBalanceException("Insufficient Funds..");
		}
		return "0";

	}

}

public class TestExceptionConcept {

	public static void main(String[] args) throws InsufficientBalanceException {
		Bank bankObject = new Bank();
		bankObject.getWithdrawAmount(600000);

	}

}

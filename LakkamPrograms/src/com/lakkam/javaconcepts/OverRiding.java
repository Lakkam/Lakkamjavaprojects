package com.lakkam.javaconcepts;

class Car {
	public void engine() {
		System.out.println("BS 4 Enginee..");
	}

	protected String getCruiseControl() {
		return "Steering Cruise";
	}

	int getNumberOfSeats() {
		return 2;
	}
}

class Scross extends Car {
	@Override
	public String getCruiseControl() {
		// TODO Auto-generated method stub
		return "Scross Cruise Control";
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Scross has BS6 Engine...");
	}

	@Override
	int getNumberOfSeats() {
		// TODO Auto-generated method stub
		System.out.println("Scross 7 seater...");
		return 7;
	}
}

public class OverRiding {

	public static void main(String[] args) {
		Car carObject = new Car();
		carObject.engine();
		System.out.println("Cruise Control..." + carObject.getCruiseControl());
		System.out.println("Number of Seats : " + carObject.getNumberOfSeats());

		Car subClassObject = new Scross();
		System.out.println("Cruise Control.." + subClassObject.getCruiseControl());
		System.out.println("Scross Number of Seats : " + subClassObject.getNumberOfSeats());

	}

}

package com.lakkam.javaconcepts;

class Human extends Object implements Cloneable {

	String numberOfCloneableParts = null;
	boolean isBrainCloneable;

	Human() {
		this.numberOfCloneableParts = "5";
		this.isBrainCloneable = false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Human humanObject = new Human();
		System.out.println("Number of Cloneable parts : " + humanObject.numberOfCloneableParts);
		System.out.println("Brian : " + humanObject.isBrainCloneable);

		Human humanClone = (Human) humanObject.clone();
		humanClone.isBrainCloneable = true;
		System.out.println("Brian after clone : " + humanClone.isBrainCloneable);
		System.out.println("Brian after clone with original object : " + humanObject.isBrainCloneable);
	}

}

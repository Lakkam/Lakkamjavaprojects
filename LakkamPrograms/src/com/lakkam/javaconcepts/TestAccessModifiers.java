package com.lakkam.javaconcepts;

/*
 * Intent of this class is to know various access modifiers and their usage and how they works in JAVA
 */
import com.lakkam.programs.JavaProgram1;

class MyAccessModifiers {

	private String name = "Lakkam";
	public int age = 36;
	protected String dob = "1984";

	public void printName() {
		System.out.println(name);
	}
}

public class TestAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAccessModifiers myObject = new MyAccessModifiers();
		// myObject.name; This will give error becasue name declared as private member
		// to its class.
		System.out.println("Age : " + myObject.age);
		System.out.println("DOB : " + myObject.dob);
		myObject.printName();
		// System.out.println("Accessing a private member value through public method :
		// " +myObject.printName());
		// System.out.println("Accessing a private member value through public method :
		// "+myObject.printName());

		JavaProgram1 objectOfJavaProgram1 = new JavaProgram1();
		// objectOfJavaProgram1.testProtected; This will give error becasue
		// testProtected is protected variable and scope of protected variable is within
		// package.
		System.out.println("Calling a public member of different package class : " + objectOfJavaProgram1.returnName());

	}

}

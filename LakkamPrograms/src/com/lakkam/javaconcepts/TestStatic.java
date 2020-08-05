package com.lakkam.javaconcepts;

class MyStatic {
	static int instanceCount = 0;

	MyStatic() {
		instanceCount++;
	}

	public static String getStaticMethodDetails() {
		return MyStatic.class.getMethods().toString();
	}
}

class MyStatic2 {
	int instanceCount = 0;

	MyStatic2() {
		instanceCount++;
	}

	public int returnInstanceCount() {
		return instanceCount;
	}
}

public class TestStatic {

	public static void main(String[] args) {
		new MyStatic();
		new MyStatic();
		System.out.println("Instance Count : " + MyStatic.instanceCount);

		new MyStatic2();
		new MyStatic2();
		System.out.println("Instance Count 2: " + new MyStatic2().returnInstanceCount());

		System.out.println("Static method details : " + MyStatic.getStaticMethodDetails());

	}

}

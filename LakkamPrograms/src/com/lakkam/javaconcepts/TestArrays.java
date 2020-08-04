package com.lakkam.javaconcepts;

class TestClass1 {

}

class TestClass2 extends TestClass1 {
	void method2() {
		System.out.println("Priting in TestClass2 method 2");
	}

}

public class TestArrays {

	public static void main(String[] args) {
		// Different types of array declarations

		int[] intNumberArray = new int[5];
		intNumberArray[0] = 1;
		byte b = 2;
		intNumberArray[1] = b; // We can still store a byte value to an int array considering byte is smaller
								// than int
		intNumberArray[2] = 'a';// Same case with char
		System.out.println(intNumberArray[0]);
		System.out.println(intNumberArray[1]);
		System.out.println(intNumberArray[2]);

		// Array with String Objects declaring, constructing and initializing in same
		// line
		String[] arrayOfMobiles = { "Moto", "Nokia", "Samsung" };
		for (String mobileElement : arrayOfMobiles) {
			System.out.println(mobileElement);
		}

		// Array with group of Objects with un-boxing concept as well
		Object[] arrayOfObjects = { new Integer(2), new Long(3L), new Float(0.3) };
		for (Object wrapperValue : arrayOfObjects) {
			System.out.println(wrapperValue);
		}

		// Array with Thread objects
		Thread[] arrayOfThreads = { new Thread(), new Thread() };
		for (Thread myThread : arrayOfThreads) {
			System.out.println(myThread.getName());
		}

		// Array of different class objects and can store sub class object into super
		// class type array
		TestClass1[] arrayOfClassObjects = new TestClass1[2];
		TestClass2 testClass2 = new TestClass2();
		arrayOfClassObjects[0] = testClass2;
		arrayOfClassObjects[1] = new TestClass1();
		for (TestClass1 myClassObject : arrayOfClassObjects) {
			System.out.println(myClassObject.getClass().getSimpleName());
		}

		// Two Dimentional Arrays
		int[][] arrayOfIntArrays = new int[2][];
		int[] firstArray = { 1, 2 };
		int[] secondArray = { 3, 4 };
		// arrayOfIntArrays[0] = firstArray;
		// arrayOfIntArrays[1] = secondArray;
		// Storing Values into 2-d arrays

		for (int twoDRef = 0; twoDRef < arrayOfIntArrays.length; twoDRef++) {
			if (twoDRef == 0) {
				arrayOfIntArrays[twoDRef] = firstArray;
			}
			if (twoDRef == 1) {
				arrayOfIntArrays[twoDRef] = secondArray;
			}
		}
		for (int i = 0; i < arrayOfIntArrays.length; i++) {
			int[] twoDArray = arrayOfIntArrays[i];
			for (int j = 0; j < twoDArray.length; j++) {
				System.out.println(twoDArray[j]);
			}

		}

	}

}

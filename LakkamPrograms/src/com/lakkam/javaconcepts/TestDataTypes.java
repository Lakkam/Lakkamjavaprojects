package com.lakkam.javaconcepts;

/*
 * Intent of this class is to know about various data types and their sizes in JAVA
 */
public class TestDataTypes {

	public static void main(String[] args) {

		byte byteValue = 0;
		short shortValue = 1;
		Byte byteObject = Byte.valueOf(byteValue);
		System.out.println("byte Size : " + byteObject.SIZE);

		Short shortObject = byteObject.shortValue();
		System.out.println("short Size : " + shortObject.SIZE);

		Integer intObject = byteObject.intValue();
		System.out.println("int Size : " + intObject.SIZE);

		Long longObject = byteObject.longValue();
		System.out.println("long Size : " + longObject.SIZE);

		Float floatObject = byteObject.floatValue();
		System.out.println("float Size : " + floatObject.SIZE);

		Double doubleObject = byteObject.doubleValue();
		System.out.println("double Size : " + doubleObject.SIZE);

		Character charObject = 'A';
		System.out.println("char Size : " + charObject.SIZE);

	}

}

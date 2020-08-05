package com.lakkam.javaconcepts;

public class TestSystemClass {

	public static void main(String[] args) {
		System.out.println("Before Exit");
		//System.exit(0);
		String s = null;
		System.gc();
		if(s==null) {
			System.out.println("String is null");
		}
		System.out.println("After Exit");
		
		System.setProperty("year", "2020");
		System.out.println(System.getProperty("year"));
	}

}

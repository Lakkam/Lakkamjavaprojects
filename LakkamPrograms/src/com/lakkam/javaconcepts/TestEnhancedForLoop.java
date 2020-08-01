package com.lakkam.javaconcepts;

public class TestEnhancedForLoop {

	public static void main(String[] args) {
		int[] years = { 2001, 2002, 2003, 2004 };
		for (int yearsIterator = 0; yearsIterator < years.length; yearsIterator++) {
			System.out.println("Printing Years in regular For loop: " + years[yearsIterator]);
		}

		/*
		 * Enhanced For loop...
		 */
		int[] years2 = { 2001, 2002, 2003, 2004 };

		for (int yearsIt : years2) {

			System.out.println("Printing Years in Enhanced  For loop: " + yearsIt);

		}

	}

}

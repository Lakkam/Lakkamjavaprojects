package com.lakkam.javaconcepts;

public class TestOperators {

	public static void main(String[] args) {

		/*
		 * UMARELSA Unary,Mul-DIV-Modulas,ADD-SUB,Relational,Logical,Short
		 * circuit,Assignment.
		 * 
		 */

		// System.out.println(“xor” + ((2 < 3) ^ (4 > 3)));
		System.out.println("xor :" + ((2 < 1) ^ (4 < 3)));

		// Unary Operators
		// -,!,++,--

		int i = 3;
		if (!(i == 4)) {
			System.out.println("testing Unary not operator : " + i);
		}
		// Mul,Div,Modulas
		System.out.println("Multiplication : " + 5 * 4);
		// Add and Sub
		// Relational Oprataors
		// <,<=,>,>=

	}

}

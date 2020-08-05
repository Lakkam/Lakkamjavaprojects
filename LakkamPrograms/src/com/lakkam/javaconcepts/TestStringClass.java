package com.lakkam.javaconcepts;

public class TestStringClass {

	public static void main(String[] args) {
		String testString1 = "LakkamRangaswamy New Beginning";
		String testString2 = "LakkamRangaswamy New Beginning";
		System.out.println(testString1.hashCode());
		System.out.println(testString2.hashCode());
		System.out.println(testString1.equals(testString2));
		System.out.println(testString1.indexOf("New"));
		String concatString = testString1.concat(testString2);
		System.out.println(concatString);
		System.out.println(testString1);
		testString1 = concatString;
		System.out.println(testString1.concat(concatString));
		System.out.println(testString1);
		
		
	}

}

package com.lakkam.javaconcepts;

import java.util.Arrays;
import java.util.Comparator;

class StringComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
}

public class Searchingconcept {

	public static void main(String[] args) {

		String[] sArray = { "One", "Two", "Three", "Four" };
		Arrays.sort(sArray);
		for (String s : sArray) {
			System.out.println(s);
		}

		System.out.println(Arrays.binarySearch(sArray, "One"));
		Arrays.sort(sArray, new StringComparator());
		System.out.println(Arrays.binarySearch(sArray, "One", new StringComparator()));

	}

}

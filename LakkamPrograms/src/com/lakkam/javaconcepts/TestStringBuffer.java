package com.lakkam.javaconcepts;

public class TestStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("String Buffer");
		sb.delete(2, 4);
		System.out.println(sb);
		sb.insert(2, 'r');
		sb.insert(4, 'i');
		System.out.println(sb);
		System.out.println(sb.reverse());

	}

}

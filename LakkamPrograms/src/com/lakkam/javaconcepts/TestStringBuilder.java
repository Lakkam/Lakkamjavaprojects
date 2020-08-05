package com.lakkam.javaconcepts;

public class TestStringBuilder {

	public static void main(String[] args) {
		//Not Immutable and Synchronized methods....Rest everything is same as StringBuffer
		StringBuilder sb = new StringBuilder("0123456");
		sb.append("abc");
		System.out.println(sb);
		sb.delete(4, 7);
		System.out.println(sb);
		sb.insert(5, "***");
		System.out.println(sb);

	}

}

package com.lakkam.javaconcepts;

class Person {
	String name;
	int age;

	Person() {
		this.name = "Lakkam";
		this.age = 35;
	}

	Person(String name1, int age1) {
		this.name = name1;
		this.age = age1;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("When using Object class equals method : " + super.equals(obj));
		// TODO Auto-generated method stub
		Person personObject2 = (Person) obj;
		/*
		 * if(this.name==personObject2.name && this.age==personObject2.age) { return
		 * true; } else { return false; }
		 */
		return ((this.name == personObject2.name) && (this.age == personObject2.age)) ? true : false;

	}
}

public class TestObjectClass {

	public static void main(String[] args) {
		Object objectClass = new Object();
		Object objectClass1 = new Object();

		// Object class equals method does not compare the
		System.out.println("Object class equals method " + objectClass.equals(objectClass1));
		int hashCode1 = objectClass.hashCode();
		int hashCode2 = objectClass1.hashCode();
		System.out.println("Object class hash code comparision : " + (hashCode1 == hashCode2));

		Person personObject1 = new Person();
		Person personObject2 = new Person("Lakkam", 35);
		System.out.println(
				"Person Objects comparision with overrided  equals method : " + (personObject1.equals(personObject2)));
		// System.out.println("Person Objects comparision with equals operator : " +
		// (personObject1.name == personObject2.name));
	}

}

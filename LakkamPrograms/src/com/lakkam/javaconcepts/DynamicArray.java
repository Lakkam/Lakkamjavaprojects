package com.lakkam.javaconcepts;

public class DynamicArray {

	static int[] tempArray;
	private int arrayIndex;
	private int arraySize;

	public DynamicArray() {
		// TODO Auto-generated constructor stub
		tempArray = new int[1];
		arrayIndex = 0;
		arraySize = 1;
	}

	public void addIntoArray(int arrayElement) {
		if (arrayIndex == arraySize) {
			growArraySize();
		}
		tempArray[arrayIndex] = arrayElement;
		arrayIndex++;

	}

	private void growArraySize() {

		int[] growableArray = new int[arraySize * 2];
		for (int temp = 0; temp < arraySize; temp++) {
			growableArray[temp] = tempArray[temp];

		}
		tempArray = growableArray;
		arraySize = arraySize * 2;

	}

	public void removeFromArray() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray dynamicArrayObject = new DynamicArray();
		dynamicArrayObject.addIntoArray(1);
		dynamicArrayObject.addIntoArray(2);
		dynamicArrayObject.addIntoArray(3);

		for (int dynamicArrayElements : tempArray) {
			System.out.println(dynamicArrayElements);
		}

	}

}

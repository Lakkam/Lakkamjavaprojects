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
		for (int arrayElementsAfterAdding : tempArray) {
			System.out.println("arrayElementsAfterAdding : " + arrayElementsAfterAdding);
		}

	}

	private void growArraySize() {

		int[] growableArray = new int[arraySize * 2];
		for (int temp = 0; temp < arraySize; temp++) {
			growableArray[temp] = tempArray[temp];

		}
		tempArray = growableArray;
		arraySize = arraySize * 2;

	}

	private void shrinkArray() {
		System.out.println("Array Index in shrinkArray()" + arrayIndex);
		int[] shrinkableArray = new int[arrayIndex];
		for (int temp = 0; temp < arrayIndex; temp++) {
			shrinkableArray[temp] = tempArray[temp];

		}
		tempArray = shrinkableArray;
		arraySize = arrayIndex;

		for (int arrayElementsAftershrinking : tempArray) {
			System.out.println("arrayElementsAftershrinking : " + arrayElementsAftershrinking);
		}

	}

	public void removeFromArray() {
		int arrayLength = tempArray.length;
		tempArray[arraySize - 1] = 0;
		arraySize--;
		arrayIndex--;

		for (int dynamicArrayElements : tempArray) {
			System.out.println("Array Elements after removing : " + dynamicArrayElements);
		}

		shrinkArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray dynamicArrayObject = new DynamicArray();
		dynamicArrayObject.addIntoArray(1);
		dynamicArrayObject.addIntoArray(2);
		dynamicArrayObject.addIntoArray(3);
		dynamicArrayObject.addIntoArray(4);
		dynamicArrayObject.addIntoArray(5);
		dynamicArrayObject.shrinkArray();
		dynamicArrayObject.removeFromArray();
		// dynamicArrayObject.shrinkArray();
		dynamicArrayObject.removeFromArray();
		dynamicArrayObject.addIntoArray(9);
		dynamicArrayObject.shrinkArray();
		// dynamicArrayObject.removeFromArray();

	}

}

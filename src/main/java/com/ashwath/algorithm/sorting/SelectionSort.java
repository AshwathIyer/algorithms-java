package com.ashwath.algorithm.sorting;

/**
 * 
 * @author Ashwath
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int i = intArray.length - 1; i > 0; i--) {
			int largest = 0;
			for (int j = 1; j < i; j++) {
				if (intArray[j] > intArray[largest]) {
					largest = j;
				}
			}
			swap(intArray, largest, i);
		}

		for (int k : intArray) {
			System.out.println(k);
		}
	}

	public static void swap(int[] array, int i, int j) {

		if (array[i] == array[j])
			return;

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}

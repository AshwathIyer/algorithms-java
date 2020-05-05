package com.ashwath.algorithm.sorting;

/**
 * 
 * @author Ashwath
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] arrayArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int i = arrayArray.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (arrayArray[j] > arrayArray[j + 1]) {
					swap(arrayArray, i, j);
				}
			}
			// System.out.println(arrayArray[i-1]);
		}

		for (int k : arrayArray) {
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

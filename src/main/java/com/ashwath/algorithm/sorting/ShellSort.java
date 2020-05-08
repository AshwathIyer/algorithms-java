package com.ashwath.algorithm.sorting;

/**
 * 
 * @author Ashwath
 *
 */
public class ShellSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < intArray.length; i++) {

				int newElement = intArray[i];
				int j = i;
				while (j >= gap && intArray[j - gap] > newElement) {
					intArray[j] = intArray[j - gap];
					j = j - gap;
				}
				intArray[j] = newElement;
			}
		}

		for (int k : intArray) {
			System.out.println(k);
		}
	}

}

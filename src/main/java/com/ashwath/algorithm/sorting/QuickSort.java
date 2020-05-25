package com.ashwath.algorithm.sorting;

/**
 * 
 * @author Ashwath
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		quickSort(intArray, 0, intArray.length);

		for (int k : intArray)
			System.out.print(k + ", ");
	}

	private static void quickSort(int[] intArray, int start, int end) {

		if ((end - start) < 2) {
			return;
		}
		int pivotIndex = partition(intArray, start, end);

		quickSort(intArray, start, pivotIndex);
		quickSort(intArray, pivotIndex + 1, end);

	}

	public static int partition(int[] intArray, int start, int end) {

		int pivot = intArray[start];
		int i = start;
		int j = end;

		while (i < j) {
			while (i < j && intArray[--j] >= pivot)
				;
			if (i < j)
				intArray[i] = intArray[j];

			while (i < j && intArray[++i] <= pivot)
				;
			if (i < j)
				intArray[j] = intArray[i];
		}
		intArray[j] = pivot;
		return j;
	}

}

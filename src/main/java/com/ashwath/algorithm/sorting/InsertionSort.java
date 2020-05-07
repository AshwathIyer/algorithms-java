package com.ashwath.algorithm.sorting;

/**
 * 
 * @author Ashwath
 *
 */
public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
		
		for(int i = 1; i<intArray.length; i++){
			int j = i;
			int unsorted = intArray[j];
			for(; j>0 && unsorted<intArray[j-1]; j--){
				intArray[j] = intArray[j-1];
			}
			intArray[j] = unsorted;
		}
		
		for(int k : intArray)
		System.out.println(k);
	}

}

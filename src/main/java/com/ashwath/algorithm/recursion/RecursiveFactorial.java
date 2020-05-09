package com.ashwath.algorithm.recursion;

/**
 * 
 * @author Ashwath
 *
 */
public class RecursiveFactorial {

	public static void main(String[] args) {
		//Method 1;
		System.out.println(recursiveFactorial(4));

		//Method 2;
		System.out.println(factorial(4));
	}

	// 1! = 0! *1 =1
	// 2! = 2*1 = 2*1!
	// 3! = 3*2*1 = 3*2!
	// 4! = 4*3*2*1 = 4*3!

	// n! = n*(n-1)!
	public static int recursiveFactorial(int num) {

		if (num == 0 || num == 1) {
			return 1;
		}

		return num * recursiveFactorial(num - 1);

	}

	//Method 2
	
	public static int fact(int i, int acc) {
		if (i == 0) {
			return acc;
		} else {
			return fact(i - 1, acc * i);
		}
	}

	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return fact(num, 1);
		}
	}

}

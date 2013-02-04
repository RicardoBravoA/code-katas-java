package com.acme.missing.unsorted;


/**
 * You are given a list of n-1 integers and these integers are in the range of 1
 * to n. There are no duplicates in list. One of the integers is missing in the
 * list. Write an efficient code to find the missing integer.
 */
public class SumFormulaMissingNumber implements MissingNumber {

	/**
	 * 1. Get the sum of numbers total = n*(n+1)/2
	 * <p>
	 * 2. Subtract all the numbers from sum and you will get the missing number.
	 *
	 * Problem: Sum may be integer overflow
	 */
	public int find(final int[] hay, final int n) {
		int sum = 0;
		for (final int i : hay) {
			sum += i;
		}
		// n *(n+1)/2
		final int gauss = Gauss.sum(n);
		return gauss - sum;
	}

}

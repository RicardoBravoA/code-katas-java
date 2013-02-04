package com.acme.missing.unsorted;


/**
 * XOR = Exclusive or
 *
 * Xoring a number with itself does nothing
 *
 * Space complexity of this solution is constant O(1) since we only use one
 * extra variable. Time complexity is O(N) because we perform a single pass from
 * the arrays.
 *
 */
public class XorMissingNumber implements MissingNumber {

	public int find(final int[] hay, final int n) {

		int x1 = hay[0];
		for (int i = 1; i < n - 1; i++) {
			x1 = x1 ^ hay[i];
		}

		int x2 = 1;
		for (int i = 2; i <= n; i++) {
			x2 = x2 ^ i;
		}

		return (x1 ^ x2);
	}

}

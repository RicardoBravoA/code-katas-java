package com.acme.missing.unsorted;

public class Gauss {

	public static int sum(final int n) {
		return n * (n + 1) / 2;
	}

	public static int sumOdd(final int n) {
		return ((n + 1) / 2 * ((n + 1) / 2 + 1)) - ((n + 1) / 2);

	}

	public static int sumEven(final int n) {
		return n / 2 * (n / 2 + 1);
	}

	public static int sum(final int lower, final int upper) {
		return sum(upper) - sum(lower - 1);
	}

	public static int sumOdd(final int lower, final int upper) {
		return sumOdd(upper) - sumOdd(lower - 1);
	}

	public static int sumEven(final int lower, final int upper) {
		return sumEven(upper) - sumEven(lower - 1);
	}

}

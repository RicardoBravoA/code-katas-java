package acme.search.prime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecursivePrime implements Prime {

	public List<Integer> find(final int upperBound) {
		if (upperBound <= 1) {
			return Collections.emptyList();
		}

		final List<Integer> primes = new ArrayList<Integer>();

		for (int i = 2; i <= upperBound; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}

		return primes;
	}

	private boolean isPrime(final int i) {
		return isPrime(i, i - 1);
	}

	private boolean isPrime(final int i, final int divisor) {
		if (divisor <= 1) {
			return true;
		}
		if (i % divisor == 0) {
			return false;
		}

		return isPrime(i, divisor - 1);
	}

}

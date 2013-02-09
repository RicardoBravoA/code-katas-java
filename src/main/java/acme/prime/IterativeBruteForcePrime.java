package acme.prime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IterativeBruteForcePrime implements Prime {

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

	boolean isPrime(final int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}

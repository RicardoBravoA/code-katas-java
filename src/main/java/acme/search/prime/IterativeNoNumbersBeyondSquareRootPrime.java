package acme.search.prime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IterativeNoNumbersBeyondSquareRootPrime implements Prime {

	@Override
	public List<Integer> find(final int upperBound) {
		if (upperBound <= 1) {
			return Collections.emptyList();
		}

		final List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);

		if (upperBound == 2) {
			return primes;
		}

		for (int i = 3; i <= upperBound; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}

		return primes;
	}

	boolean isPrime(final int n) {
		if (n % 2 == 0) {
			return false;
		}

		int limit = (int) Math.sqrt(n);
		for (int i = 3; i <= limit; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}

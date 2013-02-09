package acme.search.prime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SieveOfErastosthenesPrime implements Prime {

	// will contain true or false values for the x integers
	boolean[] primes;

	public List<Integer> find(final int upperBound) {
		if (upperBound <= 1) {
			return Collections.emptyList();
		}

		final List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);

		if (upperBound == 2) {
			return primes;
		}

		fillSieve(upperBound);

		for (int i = 3; i <= upperBound; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}

		return primes;
	}

	// set up the primesieve
	private void fillSieve(final int upperBound) {
		primes = new boolean[upperBound + 1];
		Arrays.fill(primes, true); // assume all integers are prime.

		primes[0] = primes[1] = false; // we know 0 and 1 are not prime.

		for (int i = 2; i < primes.length; i++) {
			// if the number is prime,
			// then go through all its multiples and make their values false.
			if (primes[i]) {
				for (int j = 2; i * j < primes.length; j++) {
					primes[i * j] = false;
				}
			}
		}
	}

	public boolean isPrime(final int n) {
		return primes[n];
	}

}

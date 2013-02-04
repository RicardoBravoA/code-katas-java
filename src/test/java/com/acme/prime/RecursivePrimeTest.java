package com.acme.prime;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RecursivePrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new RecursivePrime();
	}

	@Override
	@Test
	public void primesToHundred() {
		assertEquals(PRIMES_TO_HUNDRED, prime.find(100));
	}
}

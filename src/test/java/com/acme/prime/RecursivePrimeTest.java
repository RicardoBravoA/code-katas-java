package com.acme.prime;

import org.junit.Before;

public class RecursivePrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new RecursivePrime();
	}
}

package com.acme.prime;

import org.junit.Before;

public class IterativeBruteForcePrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new IterativeBruteForcePrime();
	}

}

package com.acme.prime;

import org.junit.Before;

public class SieveOfErastosthenesPrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new SieveOfErastosthenesPrime();
	}

}

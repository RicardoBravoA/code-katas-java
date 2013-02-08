package com.acme.prime;

import org.junit.Before;

public class IterativeNoEvenNumbersPrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new IterativeNoEvenNumbersPrime();
	}
}

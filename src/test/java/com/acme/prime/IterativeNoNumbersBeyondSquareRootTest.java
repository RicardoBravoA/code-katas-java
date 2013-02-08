package com.acme.prime;

import org.junit.Before;

public class IterativeNoNumbersBeyondSquareRootTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new IterativeNoNumbersBeyondSquareRootPrime();
	}
}

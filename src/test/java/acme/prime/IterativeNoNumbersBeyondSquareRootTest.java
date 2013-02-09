package acme.prime;

import org.junit.Before;

import acme.prime.IterativeNoNumbersBeyondSquareRootPrime;

public class IterativeNoNumbersBeyondSquareRootTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new IterativeNoNumbersBeyondSquareRootPrime();
	}
}

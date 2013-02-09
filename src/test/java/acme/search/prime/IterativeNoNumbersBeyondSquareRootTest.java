package acme.search.prime;

import org.junit.Before;

import acme.search.prime.IterativeNoNumbersBeyondSquareRootPrime;

public class IterativeNoNumbersBeyondSquareRootTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new IterativeNoNumbersBeyondSquareRootPrime();
	}
}

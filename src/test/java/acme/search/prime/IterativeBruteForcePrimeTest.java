package acme.search.prime;

import org.junit.Before;

import acme.search.prime.IterativeBruteForcePrime;

public class IterativeBruteForcePrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new IterativeBruteForcePrime();
	}

}

package acme.prime;

import org.junit.Before;

import acme.prime.IterativeBruteForcePrime;

public class IterativeBruteForcePrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new IterativeBruteForcePrime();
	}

}

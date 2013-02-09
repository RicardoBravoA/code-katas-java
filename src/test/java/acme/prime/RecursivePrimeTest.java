package acme.prime;

import org.junit.Before;

import acme.prime.RecursivePrime;

public class RecursivePrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new RecursivePrime();
	}
}

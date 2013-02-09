package acme.search.prime;

import org.junit.Before;

import acme.search.prime.RecursivePrime;

public class RecursivePrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new RecursivePrime();
	}
}

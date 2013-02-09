package acme.search.prime;

import org.junit.Before;

import acme.search.prime.SieveOfErastosthenesPrime;

public class SieveOfErastosthenesPrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new SieveOfErastosthenesPrime();
	}

}

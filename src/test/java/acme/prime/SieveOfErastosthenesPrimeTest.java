package acme.prime;

import org.junit.Before;

import acme.prime.SieveOfErastosthenesPrime;

public class SieveOfErastosthenesPrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new SieveOfErastosthenesPrime();
	}

}

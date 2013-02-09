package acme.search.prime;

import org.junit.Before;

import acme.search.prime.IterativeNoEvenNumbersPrime;

public class IterativeNoEvenNumbersPrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new IterativeNoEvenNumbersPrime();
	}
}

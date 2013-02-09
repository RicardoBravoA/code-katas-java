package acme.prime;

import org.junit.Before;

import acme.prime.IterativeNoEvenNumbersPrime;

public class IterativeNoEvenNumbersPrimeTest extends AbstractPrimeTest {

	@Override
	@Before
	public void setup() {
		prime = new IterativeNoEvenNumbersPrime();
	}
}

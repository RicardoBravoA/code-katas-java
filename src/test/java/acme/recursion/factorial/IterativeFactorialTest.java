package acme.recursion.factorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IterativeFactorialTest {

	@Test
	public void zeroFactorial() {
		assertEquals(1, IterativeFactorial.factorial(0));
	}

	@Test
	public void oneFactorial() {
		assertEquals(1, IterativeFactorial.factorial(1));
	}

	@Test
	public void fiveFactorial() {
		assertEquals(120, IterativeFactorial.factorial(5));
	}

}

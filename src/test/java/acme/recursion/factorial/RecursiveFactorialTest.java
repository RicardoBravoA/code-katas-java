package acme.recursion.factorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursiveFactorialTest {

	@Test
	public void zeroFactorial() {
		assertEquals(1, RecursiveFactorial.factorial(0));
	}

	@Test
	public void oneFactorial() {
		assertEquals(1, RecursiveFactorial.factorial(1));
	}

	@Test
	public void fiveFactorial() {
		assertEquals(120, RecursiveFactorial.factorial(5));
	}

}

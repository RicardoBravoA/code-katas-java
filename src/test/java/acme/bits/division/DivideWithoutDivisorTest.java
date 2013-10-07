package acme.bits.division;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivideWithoutDivisorTest {

	@Test
	public void divideNoRemainder() {
		DivideWithoutDivisor d = new DivideWithoutDivisor();

		assertEquals(5, d.divide(15, 3));
	}

	@Test
	public void divideWithRemainder() {
		DivideWithoutDivisor d = new DivideWithoutDivisor();

		assertEquals(5, d.divide(16, 3));
	}

}

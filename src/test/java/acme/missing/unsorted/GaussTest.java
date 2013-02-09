package acme.missing.unsorted;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import acme.missing.unsorted.Gauss;

public class GaussTest {

	@Test
	public void sum() {
		assertEquals(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10, Gauss.sum(10));
	}

	@Test
	public void sumOdd() {
		assertEquals(1 + 3 + 5 + 7 + 9, Gauss.sumOdd(9));
		assertEquals(1 + 3 + 5 + 7 + 9, Gauss.sumOdd(10));
	}

	@Test
	public void sumEven() {
		assertEquals(2 + 4 + 6 + 8 + 10, Gauss.sumEven(10));
		assertEquals(2 + 4 + 6 + 8 + 10, Gauss.sumEven(11));
	}

	@Test
	public void sumOffset() {
		assertEquals(4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14,
				Gauss.sum(4, 14));
	}

	@Test
	public void sumOddOffset() {
		assertEquals(3 + 5 + 7 + 9 + 11 + 13, Gauss.sumOdd(3, 13));
		assertEquals(3 + 5 + 7 + 9 + 11 + 13, Gauss.sumOdd(3, 14));
		assertEquals(3 + 5 + 7 + 9 + 11 + 13, Gauss.sumOdd(2, 13));
		assertEquals(3 + 5 + 7 + 9 + 11 + 13, Gauss.sumOdd(2, 14));
	}

	@Test
	public void sumEvenOffset() {
		assertEquals(6 + 8 + 10 + 12 + 14 + 16, Gauss.sumEven(6, 16));
		assertEquals(6 + 8 + 10 + 12 + 14 + 16, Gauss.sumEven(6, 17));
		assertEquals(6 + 8 + 10 + 12 + 14 + 16, Gauss.sumEven(5, 16));
		assertEquals(6 + 8 + 10 + 12 + 14 + 16, Gauss.sumEven(5, 17));
	}

}

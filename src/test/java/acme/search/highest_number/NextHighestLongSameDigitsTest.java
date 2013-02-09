package acme.search.highest_number;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import acme.search.highest_number.NextHighestLongSameDigits;

public class NextHighestLongSameDigitsTest {

	@Test
	public void next() {

		NextHighestLongSameDigits next = new NextHighestLongSameDigits();

		assertEquals(123456785123446789l, next.find(123456784987654321l));

	}

}

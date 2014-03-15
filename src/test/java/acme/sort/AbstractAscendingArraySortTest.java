package acme.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public abstract class AbstractAscendingArraySortTest {

	public ArraySort sortingAlgorithm;

	@Test
	public void ascendingDigits() {
		int[] in = new int[] { 5, 8, 3, 7, 6, 2 };
		int[] expected = new int[] { 2, 3, 5, 6, 7, 8 };

		assertArrayEquals(expected, sortingAlgorithm.sort(in));
	}

}

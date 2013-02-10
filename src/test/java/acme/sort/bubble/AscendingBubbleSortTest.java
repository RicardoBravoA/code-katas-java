package acme.sort.bubble;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import acme.sort.Sort;

public class AscendingBubbleSortTest {

	@Test
	public void sort() {
		Sort sort = new AscendingBubbleSort();
		int[] in = new int[] { 5, 8, 3, 7, 6, 2 };
		int[] expected = new int[] { 2, 3, 5, 6, 7, 8 };

		assertArrayEquals(expected, sort.sort(in));
	}

}

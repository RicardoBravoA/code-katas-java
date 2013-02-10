package acme.sort.quick;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import acme.sort.Sort;

public class AscendingQuickSortTest {

	@Test
	public void sort() {
		Sort sort = new AscendingQuickSort();
		int[] in = new int[] { 5, 8, 3, 7, 6, 2 };
		int[] expected = new int[] { 2, 3, 5, 6, 7, 8 };

		assertArrayEquals(expected, sort.sort(in));
	}

}

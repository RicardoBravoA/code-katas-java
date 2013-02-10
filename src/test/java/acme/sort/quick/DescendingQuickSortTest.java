package acme.sort.quick;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import acme.sort.Sort;

public class DescendingQuickSortTest {

	@Test
	public void sort() {
		Sort sort = new DescendingQuickSort();
		int[] in = new int[] { 5, 8, 3, 7, 6, 2 };
		int[] expected = new int[] { 8, 7, 6, 5, 3, 2 };

		assertArrayEquals(expected, sort.sort(in));
	}

}

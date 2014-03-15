package acme.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import acme.sort.ArraySort;
import acme.sort.DescendingArrayQuickSort;

public class DescendingArrayQuickSortTest {

	@Test
	public void sort() {
		ArraySort sort = new DescendingArrayQuickSort();
		int[] in = new int[] { 5, 8, 3, 7, 6, 2 };
		int[] expected = new int[] { 8, 7, 6, 5, 3, 2 };

		assertArrayEquals(expected, sort.sort(in));
	}

}

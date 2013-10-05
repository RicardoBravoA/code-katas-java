package acme.sort.merge;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import acme.sort.ListSort;

public class MergeListSortTest {

	@Test
	public void sort() {
		ListSort sort = new MergeListSort();
		List<Integer> in = Arrays.asList(5, 8, 3, 7, 6, 2);
		List<Integer> expected = Arrays.asList(2, 3, 5, 6, 7, 8);

		assertEquals(expected, sort.sort(in));
	}

}

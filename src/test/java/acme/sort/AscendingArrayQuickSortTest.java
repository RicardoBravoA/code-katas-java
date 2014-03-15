package acme.sort;

import org.junit.Before;

import acme.sort.AscendingArrayQuickSort;

public class AscendingArrayQuickSortTest extends AbstractAscendingArraySortTest {

	@Before
	public void setup() {
		sortingAlgorithm = new AscendingArrayQuickSort();
	}

}

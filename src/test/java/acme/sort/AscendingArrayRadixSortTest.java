package acme.sort;

import org.junit.Before;

import acme.sort.AscendingArrayRadixSort;

public class AscendingArrayRadixSortTest extends AbstractAscendingArraySortTest {

	@Before
	public void setup() {
		sortingAlgorithm = new AscendingArrayRadixSort();
	}

}

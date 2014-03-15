package acme.sort.radix;

import org.junit.Before;

import acme.sort.AbstractAscendingArraySortTest;

public class AscendingArrayRadixSortTest extends AbstractAscendingArraySortTest {

	@Before
	public void setup() {
		sortingAlgorithm = new AscendingArrayRadixSort();
	}

}

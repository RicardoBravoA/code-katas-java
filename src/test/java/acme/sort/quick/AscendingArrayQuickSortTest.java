package acme.sort.quick;

import org.junit.Before;

import acme.sort.AbstractAscendingArraySortTest;

public class AscendingArrayQuickSortTest extends AbstractAscendingArraySortTest {

	@Before
	public void setup() {
		sortingAlgorithm = new AscendingArrayQuickSort();
	}

}

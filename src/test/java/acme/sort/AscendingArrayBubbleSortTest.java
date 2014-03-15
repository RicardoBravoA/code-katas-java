package acme.sort;

import org.junit.Before;

import acme.sort.AscendingArrayBubbleSort;

public class AscendingArrayBubbleSortTest extends
		AbstractAscendingArraySortTest {

	@Before
	public void setup() {
		sortingAlgorithm = new AscendingArrayBubbleSort();
	}

}

package acme.sort.bubble;

import org.junit.Before;

import acme.sort.AbstractAscendingArraySortTest;

public class AscendingArrayBubbleSortTest extends
		AbstractAscendingArraySortTest {

	@Before
	public void setup() {
		sortingAlgorithm = new AscendingArrayBubbleSort();
	}

}

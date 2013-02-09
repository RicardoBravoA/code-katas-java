package acme.missing.unsorted;

import org.junit.Before;

import acme.missing.unsorted.SortArrayMissingNumber;

public class SortArrayMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new SortArrayMissingNumber();
	}
}

package acme.search.missing_number;

import org.junit.Before;

import acme.search.missing_number.SortArrayMissingNumber;

public class SortArrayMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new SortArrayMissingNumber();
	}
}

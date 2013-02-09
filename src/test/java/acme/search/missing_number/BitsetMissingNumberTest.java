package acme.search.missing_number;

import org.junit.Before;

import acme.search.missing_number.BitsetMissingNumber;

public class BitsetMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new BitsetMissingNumber();
	}
}

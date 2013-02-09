package acme.missing.unsorted;

import org.junit.Before;

import acme.missing.unsorted.BitsetMissingNumber;

public class BitsetMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new BitsetMissingNumber();
	}
}

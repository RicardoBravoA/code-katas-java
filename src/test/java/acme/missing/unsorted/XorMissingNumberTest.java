package acme.missing.unsorted;

import org.junit.Before;

import acme.missing.unsorted.XorMissingNumber;

public class XorMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new XorMissingNumber();
	}
}

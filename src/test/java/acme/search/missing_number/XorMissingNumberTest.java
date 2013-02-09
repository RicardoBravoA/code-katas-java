package acme.search.missing_number;

import org.junit.Before;

import acme.search.missing_number.XorMissingNumber;

public class XorMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new XorMissingNumber();
	}
}

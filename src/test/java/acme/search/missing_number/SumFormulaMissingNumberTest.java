package acme.search.missing_number;

import org.junit.Before;

import acme.search.missing_number.SumFormulaMissingNumber;

public class SumFormulaMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new SumFormulaMissingNumber();
	}
}

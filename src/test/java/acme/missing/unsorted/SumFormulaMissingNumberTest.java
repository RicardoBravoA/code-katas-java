package acme.missing.unsorted;

import org.junit.Before;

import acme.missing.unsorted.SumFormulaMissingNumber;

public class SumFormulaMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new SumFormulaMissingNumber();
	}
}

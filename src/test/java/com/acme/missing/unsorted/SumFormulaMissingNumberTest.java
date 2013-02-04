package com.acme.missing.unsorted;

import org.junit.Before;

public class SumFormulaMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new SumFormulaMissingNumber();
	}
}

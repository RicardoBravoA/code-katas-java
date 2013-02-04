package com.acme.missing.unsorted;

import org.junit.Before;

public class XorMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new XorMissingNumber();
	}
}

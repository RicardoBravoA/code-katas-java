package com.acme.missing.unsorted;

import org.junit.Before;

public class BitsetMissingNumberTest extends AbstractMissingNumberTest {

	@Override
	@Before
	public void setup() {
		missingNumber = new BitsetMissingNumber();
	}
}

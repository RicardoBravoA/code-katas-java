package com.acme.missing.unsorted;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public abstract class AbstractMissingNumberTest {

	MissingNumber missingNumber;

	@Before
	public abstract void setup();

	@Test
	public void missing() {

		final int a[] = { 6, 2, 4, 5, 1, 9, 7, 8 };
		assertEquals(3, missingNumber.find(a, 9));
	}
}
